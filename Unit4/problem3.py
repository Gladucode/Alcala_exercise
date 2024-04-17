'''
There is a system of banknotes of different values and ordered from lowest to highest (for
example 1, 2, 5, 10, 20, 50 and 100 euros), which are represented by the values vi, with
𝑖 ∈ {1, … , 𝑁} (in the previous case, N = 7) so that each banknote has a finite amount,
greater or equal to zero, which is saved in ci (following the example, c3=6 would represent
that there are 6 banknotes of 5 euros).
You want to pay exactly a certain amount of money D, using the least amount of
banknotes possible. It is known that 𝐷 ≤ ∑ 𝑐௜𝑣௜
௡
௜ୀଵ , but the exact amount D may not be
obtainable through the available banknotes.
Design an algorithm with the Dynamic Programming methodology that determines,
having as data the values ci, vi and D:
 if the amount D can be returned exactly or not, and
 in the affirmative case, how many notes of each type form the optimum
decomposition. 

'''
def init_blank_mat(n,m):
    mat = []
    temp = []
    for j in range(m):
            temp.append(0)
    for i in range(n):
        mat.append(temp)
    return mat

def sum(vec):
    s = 0
    for i in vec:
          s = s+i
    return s

def Min(x,y):
     if x<= y:
          return x
     else:
          return y


def func(c,v,D):
     MAX = sum(c)
     l = len(v)
     mat = init_blank_mat(l,D+1)
     for i in range(l):
          for j in range(D+1):
                if i == 0:
                     if ((j%v[i]) == 0) and (v[i]*c[i] >= j):
                          mat[i][j] = int(j/v[i])
                          print(i,j,j/v[i],mat[i][j])
                     else:
                          mat[i][j] = MAX
               
     return mat
                
    

v = [1,2,5]
c = [3,2,1]
D = 8

print(func(c,v,D), sep = '\n')



    
