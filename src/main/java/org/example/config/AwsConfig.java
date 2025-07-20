package org.example.config;

import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;

@Configuration
public class AwsConfig {

    public SqsClient sqsClient() {
        return SqsClient.builder().region(Region.AP_SOUTH_1).credentialsProvider(ProfileCredentialsProvider.create())
                .build();
    }
}
