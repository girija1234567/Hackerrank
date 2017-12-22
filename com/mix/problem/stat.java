package com.mix.problem;

public class stat {
static
{
	System.out.println(" static block execution");
}
{
	System.out.println("non static block execution");
}
stat()
{
	System.out.println("constructor");
}
static int i;
int j;
static void m1()
{
	System.out.println("m1  static method execution starts");
	System.out.println(stat.i);
	System.out.println("m1 execution ends");
}
void m2()
{
	System.out.println("m2 non static method execution strats");
}
}
