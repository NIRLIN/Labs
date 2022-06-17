由于jackson解析策略导致连起来的大写字段将被转为小写

参考：https://stackoverflow.com/a/43458222/17334356

可选解决策略：

@JsonProperty

MapperFeature.USE_STD_BEAN_NAMING

```yaml
spring:
  jackson:
    mapper:
      use-std-bean-naming: true
```