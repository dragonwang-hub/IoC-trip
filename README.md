#Repo for Ioc Trip

1. 第一步：我要使用Mysql作为数据库 【直接依赖】
2. 第二步：Mysql太慢了，我要换成Oracle 【使用DB接口，实现依赖抽象】
3. 第三步：这数据库不行，我要用自己的数据库 【使用中间container作为中介管理DB对象】

![img.png](img.png)
