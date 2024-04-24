prerequisites:
li a7 0 #start counter
li s0 5 #worst case run time to secure always sort

firstpair:
    bgt a0 a1 firstbigger
    j secondpair
    
firstbigger:
    mv a6 a0
    mv a0 a1
    mv a1 a6
    
secondpair:
    bgt a1 a2 secondbigger
    j thirdpair
    
secondbigger:
    mv a6 a1
    mv a1 a2
    mv a2 a6
    
thirdpair:
    bgt a2 a3 thirdbigger
    j fourthpair
    
thirdbigger:
    mv a6 a2
    mv a2 a3
    mv a3 a6
    
fourthpair:
    bgt a3 a4 fourthbigger
    j fifthpair

fourthbigger:
    mv a6 a3
    mv a3 a4
    mv a4 a6
    
fifthpair:
    bgt a4 a5 fifthbigger
    j repeat

fifthbigger:
    mv a6 a4
    mv a4 a5
    mv a5 a6
    
repeat:
    addi a7 a7 1
    bge a7 s0 done #if a7 and s0 is the same, it has run the max times to cover worst case
    j firstpair #jump to beginning to sort numbers that have now been compared to next.
    
done:
    nop    

    
    