# Java Lamda 教學


## 表達式

### pipeline

- https://en.wikipedia.org/wiki/Pipeline

- 会将从一次运算收集的输出提供给下一次运算

## 起源

### 函數式編程思維

- 程式典範的轉移

	- 程序導向

	- 物件導向

- 特性

	- 方法是一級公民

		- 高阶函数

			- 可以接收、创建或返回函数的函数或方法被视为高阶函数

			- 区分高阶函数与常规函数的规则  
			  常规函数  
			  * 可以接收对象  
			  * 可以创建对象  
			  * 可以返回对象  
			  高阶函数  
			  * 可以接收函数  
			  * 可以创建函数  
			  * 可以返回函数

	- 不變性

## 好处：代码简洁，更富于表达，不易出错，更容易并行化，而且通常比面向对象的代码更容易理解

## 參考資料

### 命令式

- 开发人员已经习惯了告诉程序做什么和该如何做

	- 所以您需要定义程序的每一步：告诉它迭代每个元素，比较值，设置 flag 变量，然后跳出循环

### 声明式

- 仍会告诉程序要做什么，但将实现细节留给底层的函数库

- 声明式思考要求您将此方法的设计思路从 “如何做” 转变为 “做什么”

### https://www.ibm.com/developerworks/cn/java/j-java8idioms11/index.html?ca=drs-

## Java 8 syntax

### 方法引用

- 方法引用还使您的代码变得非常简洁和富于表达

### 支持类型推断的 Java 版本，而且它仅对 lambda 表达式支持此功能

- 在 Java 8 中，我们可以丢弃 lambda 表达式中的类

- 此外，一般来讲，如果我们仅有一个参数，省略类型意味着也可以省略 ()

- 推断的局限性

### Lamda 表達式

- 普通的函数或方法通常有 4 个元素  
  * 一个名称  
  * 返回类型  
  * 参数列表  
  * 主体

- (parameter list) -> body  
  “->” 将参数列表与函数主体分离，旨在对给定参数进行处理。函数的主体可能是一个表达式或一条语句

- 一个理想的 lambda 表达式  
  主体只有一行：一个返回给定参数两次的表达式，没有分号，也不需要 return 关键字。

- 多行 lambda 表达式  
  在这种情况下，分号必不可少。如果 lambda 表达式返回一个结果，也会需要 return 关键字

	- (Integer e) -> {   
	    double sqrt = Math.sqrt(e);  
	    double log = Math.log(e);  
	    return sqrt + log;   
	  }

### API

- java.util.function

	- Function<T, R>

	- Predicate<T>

	- Consumer<T>

	- Supplier<T>、BiConsumer<T, U> 和 BiFunction<T, U, R>
