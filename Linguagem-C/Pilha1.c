
// Estrutura de NO da pilha
typedef struct no
{
    int val;
    struct no *proximo;
}No;

// Estrutura da pilha
typedef struct
{
    No *topo;
}Pilha;

// Operação push
