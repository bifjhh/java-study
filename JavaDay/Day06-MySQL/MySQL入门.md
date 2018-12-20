######  完成对分类表的CRUD的操作
- 需求分析
> 使用CMD命令来创建一个数据库,并对数据库中的一张分类表进行增删改查的操作

### 数据库的概述
- 什么是数据库
    - 数据库就是一个文件系统,只不过我们需要通过命令(SQL)来操作这个文件系统
    - 数据库(Database)是按照数据结构来组织,存储和管理数据的建立在计算机存储设备上的仓库.
    - 数据库是长期存储在计算机内,有组织的,可共享的数据集合.数据库中的数据是指以一定的数据模型组织,描述和存储在一起,具有尽可能小的冗余度,较高的数据独立性和以扩展性的特点并可在一定范围内为多个用户共享
- 数据库的作用
    - 储存数据,数据的仓库,带有访问权限限制不同的用户可以有不同的操作
- 为什么要学习数据库
    - 操作的都是后台数据,取到后台数据后进行封装,然后交给前端进行渲染
    
### 常见的数据库
- MySQL: 开源免费的适用于中小型企业的免费数据库,sun公司收购了,sun公司被Oracle收购了之后,开始收费了
- mariadb: 有MySQL创始人创建,直接是MySQL开源版本的的一个分支,基本上和MySQL命令一样
- Oracle: 甲骨文公司.商业软件,收费软件.适用于大型电商网站,收购了sun公司,java
- db2: IBM公司,ThinkPad,主做解决方案.软件和硬件.服务器架构.银行系统大多采用db2.
- SqlServer: Windows里面,政府网站.大学教学通常是采用SqlServer.图形化工具做的不错
- Sybase: 被淘汰的

- nosql: 非关系型数据库: key:value
- MongoDB: 
- Redis: set get 

### 关系型数据库
> 主要用来描述实体与实体之间的关系
> 实实在在存在的事物.

- E-R 关系图: 必须会画
    - 实体: 方框
    - 属性: 椭圆
    - 关系: 菱形
    
### MySQL数据库服务器
- MySQL数据库: 数据库管理软件
- 服务器: 就是一台电脑,这台电脑安装相关的服务器软件.这些软件会监听不同的端口号,根据用户的访问端口提供不同的服务

### MySQL的SQL语句
- SQL: Structure Query Language 结构化查询语言
- DDL: 数据定义语言
    - 定义数据库,数据表它们的结构: create(创建), drop(删除), alter(修改)
- DML: 数据操纵语言
    - 主要是用来操作数据 insert(插入) update(修改) delete(删除)
- DCL: 数据控制语言
    - 定义访问全新啊, 取消访问权限, 安全设置 grant
- DQL: 数据查询语言
    - select(查询) from子句 where子句

### 数据库的CRUD操作
- 首先登陆数据库
##### 创建数据库 
```sql
-- create database--数据库名字
CREATE database;
-- 创建数据库的时候指定字符集
-- CREATE database-数据库名 character SET UTF8-字符集 
CREATE day06 CHARACTER SET UTF8;

-- CREATE database-数据库名 CHARACTER SET UTF8-字符集 COLLATE-校对规则
CREATE day06 CHARACTER SET UTF8 COLLATE;

```

##### 查看数据库 
```sql

-- show create database; 查看数据库的定义语句
-- show databases; 查看所有库
-- information_schema
-- performance_schema
-- mysql

```

##### 修改数据库 
```sql
-- ALTER database 数据库名 CHARACTER SET UTF8;
ALTER DATABASE day06 CHARACTER SET UTF8;

```

##### 删除数据库 
```sql
-- DROP database 数据库名;
DROP DATABASE day06;

```
##### 其他数据库操作 
```sql

-- USE database 数据库名 -- 切换数据库;
USE DATABASE day06;
-- 查看当前正在使用的数据库
SELECT 

```

### 表的CRUD操作
##### 创建表
- 列的类型(长度代表的是字符的个数)
    - java      sql
    - int       int
    - char      char 固定长度
    - String    varchar 可变长度
    - double    double
    - float     float
    - boolean   boolean
    - date      date
- 列的约束
    - 主键约束  primary key
    - 唯一约束  unique
    - 非空约束  not null           
```sql
-- CREATE TABLE 表名(列名 列的类型 约束)
CREATE TABLE student (
  sid INT PRIMARY KEY, 
  name VARCHAR(30), 
  sex int,
  age int
);

```
##### 查看表
```sql
-- 查看所有表
SHOW TABLES;
-- 查看表的定义
SHOW CREATE TABLE student;
-- 查看表结构
DESC student;

```

##### 修改表
- 添加列(add)
- 修改列(modify)
- 修改列名(change)
- 删除列(drop)
- 修改表名(rename)
- 修改表的字符集
```sql
-- 添加列  ALTER TABLE 表名 ADD 列名 列的类型 列的约束
ALTER TABLE student ADD chengji INT NOT NULL ;

--  修改列(modify)
ALTER TABLE student MODIFY sex VARCHAR(2); 

-- 修改列名(change)
ALTER TABLE student CHANGE sex gender VARCHAR(2); 

-- 删除列(drop)
ALTER TABLE student DROP chengji;

-- 修改表名(rename)
RENAME TABLE student to heima;

-- 修改表的字符集
ALTER TABLE heima CHARACTER SET GBK;

```
##### 删除表

```sql
DROP TABLE heima;
```

### SQL完成对表中数据的CRUD的操作
##### 插入数据
```SQL
-- INSERT INTO 表名 (列名1,列名2,列名...) VALUES(值1,值2,值...);
INSERT INTO student (sid,name,sex,age) VALUES(1,'bifjhh',0,24);

-- 简单写法 INSERT INTO 表名  VALUES(值1,值2,值...);
INSERT INTO student VALUES(2,'xmj',0,25);

-- 批量插入
INSERT INTO student VALUES(3,'003',0,25),(4,'004',0,25),(5,'005',0,25);

-- 单条插入和批量插入的效率

-- 查看表中数据
SELECT * FROM student;

```

##### 删除表记录
```sql
-- DELETE FROM 表名 [WHERE 条件];  -- DML
DELETE FROM student WHERE sid=3;

-- TRUNCATE:DDL 先删除表再建表

```

##### 更新表记录
```sql
-- UPDATE 表名 SET sid=5 WHERE 条件;
UPDATE student SET sid=5 WHERE sid=3;

```

##### 查询
```sql
-- 查询指定的数据
-- SELECT DISTINCT [ * ] [列名1,列名2] FROM 表名 [WHERE 条件];
-- SELECT [DISTINCT] [ * ] [sid] FROM student [WHERE sid =1];

-- SELECT 列名 FROM 表名;  只查看指定列数据
SELECT name FROM product;

-- 别名查询 as 关键字, as 关键字可以省略的
--     表别名 SELECT p.pname,p.price FROM product as p;(主要是用在多表查询)
--     列别名 SELECT pname AS 商品名称,price AS 商品价格 FROM product;
-- SELECT DISTINCT price FROM product; DISTINCT去重的效果
SELECT DISTINCT price FROM product;

-- 运算查询 仅在结果上做了运算
SELECT * price*0.8 AS 折后价 FROM product;

-- 条件查询
  -- 指定条件,确定要操作的记录
SELECT * FROM product WHERE price > 100;
SELECT * FROM product WHERE price > 10 AND price <100;
SELECT * FROM product WHERE price BETWEEN 10 AND 100;

-- like : 模糊查询
-- _ 代表一个字符
-- % 代表多个字符

-- in 在某个范围内获取值
SELECT * FROM product WHERE cno IN (1,4,5);

-- order by 关键字  排序查询
-- asc : ascend     升序  SELECT * FROM product ORDER BY price ASC;
-- desc: descend    降序  SELECT * FROM product ORDER BY price DESC;
-- 查询某个名称的排序
-- SELECT * FROM product WHERE pname LIKE '小%' ORDER BY price ASC ;

-- 聚合函数 注意 WHERE 条件后面不能接聚合函数
SUM() : -- 求和
AVG() : -- 求平均值
COUNT() : -- 统计数量
MAX() : -- 最大值
MIN() : -- 求最小值

SELECT MAX(price) FROM product;

-- 子查询   求大于平均值的价格 在() 内使用聚合函数
SELECT * FROM product WHERE price > (SELECT AVG(price) FROM product);

-- 分组查询 关键字 group by
-- 1. 根据 cno 分组,分组后统计商品的个数
SELECT cno,COUNT(*) FROM product GROUP BY cno;
-- 2. 根据cno 分组,分组统计每组商品的平均价格,并且商品的平均价格 > 60
SELECT cno,COUNT(*) FROM product GROUP BY cno HAVING AVG(price) > 60;

-- having 关键字 可以接聚合函数的, 出现在分组之后
-- where 关键字 他是不可以接聚合函数的, 出现在分组之前

-- SQL 的编写顺序
-- S - F - W - G - H - O
SELECT  FROM WHERE GROUP BY  HAVING ORDER BY

-- 执行顺序
-- F - W - G - H - S - O
FROM WHERE GROUP BY HAVING SELECT ORDER BY
REFERENCES 
​````

### SQL 会创建多表及多表的关系
- 多表间的关系如何来维护
- 外键约束: foreign key 
    - 给 product 中的 cno 添加一个外键约束
        - `alter table product add  foreign key(cno) reference category(cid); ` 
​```sql
-- 添加外键约束
ALTER TABLE product ADD FOREIGN  KEY(cno) REFERENCES category(cid);

-- 当增加过关联后,再删除时无法删除成功
DELETE FROM category WHERE cid=5;
-- 如果想要删除,则需要将product表中cno和category表的cid相关联的数据先删除,去除两表之间的关联

```
- 建库原则
    - 通常情况下, 一个项目/应用建一个数据库
    
- 多表之间的关系如何维护
    - 外键约束 foreign key
    - 添加外键 
        - 后续补充时添加 alter table product add foreign key(cno) references category(cid);  
        - 建表时添加(在DDL内) foreign key(cno) references category(cid);
        - 注意: 删除的时候需要先删除外键关联,然后才能删除数据
    
- 多表之间的建表原则  
    - 一对多   商品和分类
        - 建表原则:在多的一方,添加一个外键,指向少的一方的主键
    - 多对多   老师和学生,学生和课程
        - 建表原则: 建立一张中间表,将多对多的关系拆分成一对多的关系.中间表至少要有两个外键:这两个外键分别指向原来的那张表
    - 一对一 班级和班长  公民和身份证
        - 建表原则: 
            - 将一对一的情况当做是一对多情况处理,在任意一张表添加一个外键,并且这个外键要唯一.指向另外一张表
            - 直接将两张表合并成一张表
            - 将两张表的主键建立起链接,让两张表里面的主键相等
        - 实际用途:(拆表操作时)
            - 个人信息: 姓名,性别,年龄,身高,体重...等等
            - 拆表操作: 将个人的常用信息和不常用信息,减少表的臃肿

- 主键约束--默认就是不能为空--唯一的
    - 外键都是指向另外一张表的主键
    - 主键一张表只能有一个
- 唯一约束: 列面的内容,必须是唯一,不能出现重复情况,为空
    - 唯一约束不可以作为其他表的外键
    - 一张表可以有多个唯一约束

##### 内链接查询
```sql
SELECT * FROM product;
SELECT * FROM category;
INSERT INTO product VALUES (NULL, '耐克帝', 10, NULL );
-- 数据准备
INSERT INTO product VALUES (NULL, '耐克帝', 10, NULL );
INSERT INTO category VALUES (100, '电脑办公', '电脑');
-- 内连接查询

-- 隐式内链接
SELECT * FROM product AS p,category AS c WHERE p.cno = c.cid;
-- 显示内链接
SELECT * FROM product p INNER JOIN category c ON  p.cno = c.cid;
-- 区别 
-- 隐式内连接: 在查询出结果的基础上做的WHERE条件过滤
-- 显示内链接: 带着条件去筛选结果,执行效率要高一些

-- 左外链接 会将左表中的所有数据查询出来,如果右表中没有对应的数据,则用NULL代替
SELECT * FROM product p LEFT OUTER JOIN category c ON p.cno = c.cid;

-- 右外链接 会将右表中的所有数据查询出来,如果左表中没有对应的数据,则用NULL代替
SELECT * FROM product p RIGHT OUTER JOIN category c ON p.cno = c.cid;

```

##### 分页查询

- 每页数据数据3
`SELECT * FROM product LIMIT 0,3; `
- 第一个参数是索引,第二个参数数据个数
    - 起始索引: index 代表第几页 显示几条数据
    - startIndex = (index-1)*3 (计算起始索引 第一页显示 0 - 3, 第二页 3 - 3)

##### 子查询 (SQL查询套SQL)
- 查询分类名称为手机数码的所有商品 
```sql
SELECT * FROM product WHERE cno = (SELECT cid FROM category WHERE cname="手机数码");
```
- 查询商品名称,商品分类名称信息
```sql
-- 左链接查询
SELECT p.pname,c.cname FROM product p LEFT OUTER JOIN category c ON p.cno = c.cid;
-- 子查询
SELECT pname,(SELECT cname FORM category c WHERE p.cno=c.cid ) FROM product p;

```
- 基本查询
    - 所有员工的信息
        `SELECT * FROM emp;`
    - 薪资大于等于1000并且小于等于2000的员工信息
        `SELECT * FROM emp WHERE sal>=1000 and sal<= 2000;`
    - 从员工表中查询出所有的部门编号
    - 查询出名字以A开头的员工的信息
    - 查询出名字第二个字母是L的员工信息
    - 查询出没有奖金的员工信息
    - 所有员工的平均工资
    - 所有员工的工资总和
    - 所有员工的数量
    - 最高工资
        `SELECT MAX(sal) FROM emp;`
    - 最少工资
        `SELECT MIN(sal) FROM emp ;`
    - 最高工资的员工信息
        `SELECT * FROM emp WHERE sal=(SELECT MAX(sal) FROM emp);`
    - 最低工资的员工信息
        `SELECT * FROM emp WHERE sal=(SELECT MIN(sal) FROM emp);`

















