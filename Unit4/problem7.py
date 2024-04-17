'''
A sequence of bits A is defined as a sequence A={a1, a2,..., an} where each ai can take the
value 0 or the value 1, and n is the length of the sequence A. From a sequence it is defined
a subsequence X of A as X = {x1, x2,..., xk}, where kn, so that X can be obtained by
eliminating some element of A but respecting the order in which the bits appear; for
example, if A={1,0,1,1,0,0,1} we could obtain as subsequences {1,1,1,0,1}, {1,0,1} or
{1,1,0,0} among others, but you could never get the subsequence {1,0,0,1,1}.
Given two sequences A and B, X is called a common subsequence of A and B when X is
a subsequence of A and is also a subsequence of B. (although they may have been
obtained by removing different elements in A than B, and even different quantities of
elements). Assuming the sequences A = {0,1,1,0,1,0,1,0} and B = {1,0,1,0,0,1,0,0,1}, a
common subsequence would be X = {1,1,0,1}, but it could not be X = {0,1,1,1,0}.
We want to determine the common subsequence of two sequences A and B that have the
maximum length, for which it is requested
• explain in detail how to solve the problem, and
• make a Dynamic Programming algorithm that obtains the maximum possible
length and a common sequence of that length.  
'''
def mprint(mat):
    n = len(mat)
    m = len(mat[0])
    for i in range(n):
        
        print(mat[i])

def init_mat(A,B):
    mat = []
    temp = []
    la = len(A)
    lb = len(B)
    for j in range(lb):
        temp.append("l")
    for i in range(la):
        mat.append(temp)
    
    found = False
    for  i in range(lb):
        if found == False:
            if A[0] == B[i]:
                mat[0][i] = 1
                found = True
            else:
                mat[0][i] = 0
        else:
            mat[0][i] = 1
    mprint(mat)
    print()
    found = False
    for i in range(la):
        if found == False:
            if A[i] == B[0]:
                mat[i][0] = 1
                found = True
            else:
                mat[i][0] = 0
        else:
            mat[i][0] = 1
    
    return mat

            








def fill_matrix(A,B):
    
    mat = init_mat(A,B)
    mprint(mat)
    la = len(A)
    lb = len(B)
    for i in range(1,la):
        for j in range(1,lb):
            if A[i] == B[j]:
                mat[i][j] = mat[i-1][j-1]+1
            else:
                mat[i][j] = mat[i][j-1]
    return mat

A = [0,1,1,0,1,0,1,0]
B = [1,0,1,0,0,1,0,0,1]
    
mprint(init_mat(A,B))


#la funzione che inserisce i valori nella matrice e' corretta, bisogna fare init matrix