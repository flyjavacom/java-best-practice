package top.ylonline.sb.redis.v2.anno;

import org.springframework.context.annotation.Import;
import top.ylonline.sb.redis.v2.TRedisAutoConfiguration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * enable custom redis auto configuration
 * <pre>
 *     主要注册自定义的 RedisTemplate、KeyGenerator、CacheManager Bean
 * </pre>
 *
 * @author YL
 * @since spring-data-redis 2.0.0.RELEASE
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Import({TRedisAutoConfiguration.class})
public @interface EnableTRedisConfiguration {
}
