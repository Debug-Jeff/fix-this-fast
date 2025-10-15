def add(x y):
    return x + y

def subtract(x, y)
    return x - y

def multiply(x, y):
return x * y

def divide(x, y):
    if y = 0
        return "Cannot divide by zero!"
    else
        return x / y

print("Welcome to the calculator!")
num1 = input("Enter first number: ")
num2 = input("Enter second number: ")

print("Choose operation: +, -, *, /")
choice = input("Enter operation: ")

if choice == '+':
    print("Result is: " + add(num1, num2))
elif choice == '-':
    print("Result is: " + subtract(num1, num2))
elif choice == '*':
    print("Result is: " + multiply(num1, num2))
elif choice == '/':
    print("Result is: " + divide(num1, num2))
else
    print("Invalid operation")
