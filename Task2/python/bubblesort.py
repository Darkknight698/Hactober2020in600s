def bubbleSort(ar):
   n = len(ar)
   # Traverse through all array elements
   for i in range(n):
   # Last i elements are already in correct position
      for j in range(0, n-i-1):
      # Swap if the element found is greater than the next element
         if ar[j] > ar[j+1] :
            ar[j], ar[j+1] = ar[j+1], ar[j]
# Driver code to test above
ar = [64,34,25,12,22,11,90]
bubbleSort(ar)
print (" Final Array :")
for i in range(len(ar)):
   print ("%d" %ar[i])
