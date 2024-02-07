'''
A set of n files must be stored on a magnetic tape (sequential path storage medium), each
file having a known length l1, l2, …, ln. To simplify the problem, it can be assumed that
the reading speed is constant, as well as the information density in the tape.
The rate of use of each stored file is known in advance, that is, the number of pi requests
corresponding to the file i that will be made is known. Therefore, the total of requests to
the support will be the quantity 𝑷 = ∑ 𝒑𝒊. After requesting a file, when it is found, the
tape is automatically rewound until its beginning.
The objective is to decide the order in which the n files should be stored so that the average
loading time is minimized, creating a correct greedy algorithm.'''




from mylib import mergeSort


def order_to_load(dict):
    mid = {}
    for e in dict.keys():
        mid.update({dict.get(e)[0]*dict.get(e)[1]:e})
    ordered = list(mid.keys())
    mergeSort(ordered,0,len(ordered)-1)
    final = {}
    for i in range(len(ordered)):
        k = mid.get(ordered[i])
        v = dict.get(k)
        final.update({k:v})
    print(final)
    

        


dict = {

    "F1" : [5,3],
    "F2" : [7,4],
    "F3" : [2,5]

}
order_to_load(dict)













 