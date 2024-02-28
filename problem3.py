'''
Consider a function f(x) which is known to have a unique local minimum at point x0 in
the real interval [p1, p2], which is strictly decreasing between [p1, x0] and which is
strictly increasing between [x0, p2]. Note that x0 may coincide with p1 or with p2.
Search, as efficiently as possible, all the points x (if they exist) of the interval [p1, p2]
such that the function f takes a certain value k, that is, you look for the set of values {x ∈
[p1, p2] such that f (x) = k}. To simplify the process, instead of the exact value of each
x, a range of values [α, β] can be indicated, with β - α <ε, where x is found. The algorithm
data will be the interval [p1, p2], the value k that is being searched for, and the value ε
for the approximation. 

'''

import math
def f(x):
    return abs(x)

def func(p1,p2,k,e):
    list = []
    if (p2-p1)<e:
        if f(p1)>f(p2):
            if(f(p1)<k or f(p2)>k):
                pass
            else:
                print(p1,p2)
            

        
        elif f(p1)<f(p2):
            if(f(p1)>k or f(p2)<k):
                pass
            else:
                print(p1,p2)
        
        
    
    else:
        z = (p2-p1)/3
        func(p1,p1+z,k,e)
        func(p1+z,p2-z,k,e)
        func(p2-z,p2,k,e)
        
    
            
func(-1,3,0.45,0.001)