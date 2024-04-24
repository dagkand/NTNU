main:
    add a0, a0, a1
    add s0, a2, a3
    add s1, a4, a5
    
    bgt s0, a0, updatemax1
    bgt s1, a0, updatemax2
    j endprogram
    
updatemax1:
    bgt s1, s0, updatemax2
    mv a0, s0
    j endprogram

updatemax2:
    mv a0, s1
    
endprogram:
    nop