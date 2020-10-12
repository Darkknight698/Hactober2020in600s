#include<iostream>

class Hello{
private:
    char *wish;

public: 
    Hello():wish("Hello"){}
    void print(){
        std::cout<<wish;
    }
};

int main(){
    //create Object
    Hello h;
    h.print();
    return 0;
}