main:
    li a1, 0
    li a2, 1
    mv a4, a0
    li a5, 1
    
biggestdivider:
    addi a2, a2, 1
    rem a3, a0, a2
    bgt a3, a1, biggestdivider
    
if0rest:
    div a0, a0, a2
    
squareroot:
    mul a6, a5, a5
    beq a4, a6, hassqrt
    addi a5, a5, 1
    bgt a6, a4, nosqrt
    j squareroot
    
nosqrt:
    li a1, 0
    j end

hassqrt:
    li a1, 1
    
end:
    nop
    
    