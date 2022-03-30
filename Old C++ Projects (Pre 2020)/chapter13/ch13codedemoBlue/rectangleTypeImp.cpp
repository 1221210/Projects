#include <iostream>
#include "rectangleType.h"
 
using namespace std; 

rectangleType rectangleType::doubleDimensions()
{
    length = 2 * length;
    width = 2 * width;

    return *this;
}

void rectangleType::setDimension(double l, double w)
{
    if (l >= 0)
        length = l;
    else
        length = 0;

    if (w >= 0)
        width = w;
    else
        width = 0;
}

double rectangleType::getLength() const // returns length
{
    return length;
}

double rectangleType::getWidth()const // returns width
{
    return width;
}

double rectangleType::area() const // returns area, w*l
{
    return length * width;
}

double rectangleType::perimeter() const // returns the perimeter (2*( length + width))
{
     return 2 * (length + width);
}

void rectangleType::print() const // prints the length and width
{
    cout << "Length = "  << length
         << "; Width = " << width;
}

rectangleType::rectangleType(double l, double w) // 
{
    setDimension(l, w);
}

rectangleType::rectangleType()
{
    length = 0;
    width = 0;
}

