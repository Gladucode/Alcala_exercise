'''
We have n natural numbers, where n is an even number, which have to come together
forming pairs of two numbers each. Then, from each pair, the sum of its two components
is obtained, and from all these results the maximum is taken.
Design a greedy algorithm that creates the pairs so that the maximum value of the sums
of the numbers of each pair is as small as possible, showing that the candidate selection
function used provides an optimal solution.
'''
from mylib import mergeSort




def max(list):
    max = list[0]
    for i in list:
        if(i>=max):
            max = i
    return max
        

def smallest_sum(list):
    l = len(list)
    if(l%2!=0):
        return -1
    else:
        mergeSort(list,0,l-1)
        sums = []
        for i in range(int(l/2)):
            sums.append(list[i]+list[l-1-i])
        return max(sums)
        
        


test = [5,8,1,4,7,9]
print(smallest_sum(test))

























