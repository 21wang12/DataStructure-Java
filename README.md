<!-- vscode-markdown-toc -->
* 1. [ACMEBicycle](#ACMEBicycle)
* 2. [Variable](#Variable)
* 3. [Primitive](#Primitive)

<!-- vscode-markdown-toc-config
	numbering=true
	autoSave=true
	/vscode-markdown-toc-config -->
<!-- /vscode-markdown-toc -->
# DataStructure-Java
利用Java实现数据结构

# Tutorial
##  1. <a name='ACMEBicycle'></a>ACMEBicycle
接口可以看成是一个合同，当某个类实现一个接口时，该类需要实现接口中定义的所有方法。
##  2. <a name='Variable'></a>Variable
修改静态成员变量，查看修改后的值。经过测试可知，静态成员变量只存在一份，所有对同一个静态成员变量的访问的实际上访问的是同一块内存区。所以无论是通过类进行访问还是通过实例对象进行访问，修改该静态成员变量的值实际上都是对同一个变量进行修改。修改后，无论以何种方式进行访问，访问到的都是修改后的值。
##  3. <a name='Primitive'></a>Primitive
1. 局部变量未初始化时在访问之前为赋值，则会产生编译时错误
2. 查看各个原始数据类型的大小、范围的方法。
