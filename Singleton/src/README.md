有一些对象只需要一个
* 线程池
* 缓存
* 对话框
* 处理偏好设置和注册表的对象
* 日志对象
* 打印机、显卡的驱动程序的对象
.....


这些对象只能有一个实例，如果制造出多个实例，就会导致许多问题：
* 程序的异常行为
* 资源使用过量
* 不一致的结果

全局变量来控制的缺点（静态类变量、静态方法、适当的访问修饰符）：
* 程序一开始就会创建好对象（和JVM有关）


程序中使用的全局资源只有一份:
* 注册表设置对象，如果有多个拷贝，可能会把设置搞得一团乱

常用来管理共享的资源：
* 数据库连接
* 线程池

