section .data
    message db "Hello, World!", 0xA  ; Define a string with a newline
    msg_len equ $ - message          ; Calculate the length of the string

section .bss
    result resb 1                    ; Reserve 1 byte for a result

section .text
    global _start                    ; Entry point for the program

_start:
    ; Write the message to stdout
    mov rax, 1                       ; syscall: write
    mov rdi, 1                       ; file descriptor: stdout
    mov rsi, message                 ; pointer to the message
    mov rdx, msg_len                 ; length of the message
    syscall                          ; make the syscall

    ; Perform a simple addition
    mov rax, 5                       ; Load 5 into rax
    mov rbx, 3                       ; Load 3 into rbx
    add rax, rbx                     ; Add rbx to rax
    mov [result], al                 ; Store the result (low byte) in memory

    ; Exit the program
    mov rax, 60                      ; syscall: exit
    xor rdi, rdi                     ; exit code: 0
    syscall                          ; make the syscall