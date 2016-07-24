#设计模式

##策略模式

>定义了算法族，分别封装起来，让他们之前可以互相替换，此模式让算法的变化独立于使用算法的客户。

1. 为鸭子提供会飞会叫，但是每一种鸭子叫声和飞的都不相同，
2. 把这两种行为作为两个接口分别实现
3. 通过setter方法设置鸭子的行为
4. 代码位置 src/main/java/pattern/strategy

##观察者模式

>定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

1. 面板监听天气变化，天气变化时 实时改变面板显示的信息。
2. 实现Observer-Subject
3. 代码位置 
   + 手工提供实现 src/main/java/pattern/observer/normal
   + java内置实现 src/main/java/pattern/observer/java
   
##装饰者模式

>动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案

1. 点咖啡功能，动态添加咖啡的额外东西并获得价格
2. 代码位置 src/main/java/pattern/decorator

##单例模式

>确保一个类只有一个实例，并提供安全访问点

1. 代码位置 src/main/java/pattern/singleton

##工厂模式

>处理创建对象的细节

1. 抽象工厂模式 提供一个接口，用户创建相关或依赖对象的家族,而不需要明确指定具体类。代码位置 src/main/java/pattern/factory/abstractFactory
2. 工厂方法模式 定义了一个创建对象的接口,但是由子类决定要实例化的类是哪一个,工厂方法让类把实例化推迟到子类。代码位置 src/main/java/pattern/factory/factoryMethod
3. 简单工厂模式 并不是一个设计模式，代码位置 src/main/java/pattern/factory/simpleFactory

##命令模式

>将“请求”封装成对象，以便使用不同的请求，队列或者日志来参数化对象，命令模式也支持可撤销的命令。

1. 代码位置 src/main/java/pattern/factory/command

##状态模式
>允许对象在内部状态改变时改变它的行为，对象看起来好像修改它的类。

1.  代码位置 src/main/java/pattern/factory/state

##代理模式
>为另一个对象提供一个替身或占位符以控制对这个对象的访问

1.  代码位置 src/main/java/pattern/factory/proxy