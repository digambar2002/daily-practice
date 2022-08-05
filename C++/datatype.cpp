#include <iostream>
#include <stdio.h>
#include <iomanip>
int main()
{

    int num1;
    long long int num2;
    char ch;
    float num3;
    double num4;

    std::cin >> num1 >> num2 >> ch >> num3 >> num4;

    std::cout << num1 << "\n";
    std::cout << num2 << "\n";
    std::cout << ch << "\n";
    std::cout << std::fixed;
    std::cout << std::setprecision(3);
    std::cout << num3 << "\n";
    std::cout << std::fixed;
    std::cout << std::setprecision(9);
    std::cout << num4 << "\n";
    return 0;
}
