#include <iostream>

//运算符重载
class Person{
public:
	int m_A;
	int m_B;

	Person& plusPerson(Person& p){
		this->m_A += p.m_A;
		this->m_B += p.m_B;
		return *this; 
	}

	//通过成员函数重载运算符
	
	Person operator+ (Person& p){
		Person temp;
		temp.m_A = this->m_A+p.m_A;
		temp.m_B = this->m_B+p.m_B;
		return temp;
	}
	
	//重载运算符的函数重载
	Person operator+ (int i) {
		Person temp;
		temp.m_A = this->m_A + i;
		temp.m_B = this->m_B + i;		
		return temp;
	}
	
};

//通过全局函数重载运算符

Person operator+(Person& p1,Person& p2){
	Person temp;
	temp.m_A = p1.m_A + p2.m_A;
	temp.m_B = p2.m_B + p2.m_B;
	return temp;
}


int main (int argc, char const* argv[])
{
	Person p1;
	p1.m_A=10;
	p1.m_B=10;
	Person p2;
	p2.m_A=11;
	p2.m_B=11;
	
	//无论是全局函数的重载还是成员函数的重载都可以使用下面的简化调用形式
	
	//Person p3 = p1+p2;
	//成员函数重载的本质：
	Person p4 = p1.operator+(p2);
	std::cout<<p4.m_A<< " \t "<<p4.m_B <<std::endl;
	
	//全局函数重载的本质：
	Person p5 = operator+(p1,p2);
	std::cout<<p5.m_A<< " \t "<<p5.m_B <<std::endl;
	
	//重载运算符的函数重载
	Person p6 = p2+4;
	std::cout<<p6.m_A<< " \t "<<p6.m_B <<std::endl;
	return 0;
}
