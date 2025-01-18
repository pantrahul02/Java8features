package org.example.threads;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

public class ThreadOrderExample {

    public static void main(String[] args) {
        var ref = new AtomicReference<BigDecimal>();
        CompletableFuture<Map<String, BigDecimal>> orderServiceCompletableFuture =
                CompletableFuture.supplyAsync(() ->
                new OrderService().placeOrder());
        orderServiceCompletableFuture.whenComplete((result,exception)-> {
           if(exception!=null)
               throw new RuntimeException(exception);
           var total = new ComputeOrders().total(result.values());
           ref.set(total);
        });
        var map = orderServiceCompletableFuture.join();

        var total = new ComputeOrders().total(map.values());
        System.out.println("Total:::"+total);
    }
}

class OrderService {
    Map<String, BigDecimal> placeOrder() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Map.ofEntries(
                Map.entry("sugar", new BigDecimal("5000")),
                Map.entry("salt", new BigDecimal("1000")),
                // Add more entries here
                Map.entry("pepper", new BigDecimal("300")),
                Map.entry("spice", new BigDecimal("700")),
                Map.entry("abc", new BigDecimal("100"))
                // Add as many entries as needed
        );
    }

}

class ComputeOrders {
    BigDecimal total(Collection<BigDecimal> amounts) {
        return amounts.stream().reduce(new BigDecimal("0.0"), BigDecimal::add);
    }
}
