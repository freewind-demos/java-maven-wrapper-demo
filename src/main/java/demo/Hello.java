package demo;

import org.apache.commons.lang3.StringUtils;

public class Hello {

  public static void main(String[] args) {

    CacheConfiguration<Long, String> cacheConfiguration = CacheConfigurationBuilder.newCacheConfigurationBuilder(Long.class, String.class,
                    ResourcePoolsBuilder.heap(100))
            .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(20)))
            .build();

    System.out.println(StringUtils.trim("Hello World!  "));
  }

}
