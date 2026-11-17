# 🏛️ Faculdade — Engenharia de Software

Bacharelado em Engenharia de Software: anotações, materiais e trabalhos por período e disciplina.

## Períodos e disciplinas


Os períodos seguem a sequência dos blocos de disciplinas cursados. A numeração não afirma a classificação oficial da faculdade como semestre ou trimestre; os blocos podem se sobrepor.

| Período | Início | Encerramento informado | Disciplinas |
| --- | --- | --- | --- |
| [Período 01](periodo-01/README.md) | 29/09/2025 | aproximadamente 23/12/2025 | Algoritmos e Lógica de Programação; Linguagem e Técnicas de Programação |
| [Período 02](periodo-02/README.md) | 23/02/2026 | aproximadamente 30/05/2026 | Fundamentos e Arquitetura de Computadores; Redes de Computadores |
| [Período 03](periodo-03/README.md) | 04/05/2026 | aproximadamente 15/08/2026 | GO - Projeto de Vida; Matemática Aplicada à Computação |
| [Período 04](periodo-04/README.md) | 20/07/2026 | previsto para 27/10/2026 | Engenharia de Software; Produção do Conhecimento Científico, Tecnológico e Disrupção |
| [Período 05](periodo-05/README.md) | 28/09/2026 | previsto para aproximadamente 23/12/2026 | Engenharia de Requisitos; Programação Orientada a Objetos |

As datas finais representam publicações de notas ou suas previsões. Consulte o README de cada período para observações sobre recuperação.

## Estrutura

```
faculdade/
└── periodo-NN/
    ├── README.md                ← datas e disciplinas do período
    └── nome-da-disciplina/
        ├── README.md            ← ficha + índice da disciplina
        ├── anotacoes/           ← uma nota por aula ou assunto (ex.: 01-introducao.md)
        ├── materiais/           ← arquivos de apoio, com a fonte de cada um
        └── trabalhos/           ← uma pasta por atividade, com README próprio (enunciado, requisitos, solução)
```

## Como adicionar conteúdo

1. Localize a disciplina em `periodo-NN/`.
2. Escreva anotações em `anotacoes/`, com arquivos como `01-introducao.md`.
3. Guarde arquivos de apoio em `materiais/`, registrando suas fontes.
4. Crie uma pasta em `trabalhos/` para cada atividade. Trabalhos com muito código podem ganhar repositório próprio (ficha em [projetos/](../projetos/README.md)).
5. Atualize o README da disciplina com links relativos.

Para um novo período, use o próximo número sequencial, registre as datas e crie as disciplinas com a mesma estrutura (template: `_templates/disciplina.md`). Mantenha os nomes oficiais das disciplinas nos documentos.

Repositório original: https://github.com/o-matheus/faculdade-engenharia-de-software (conteúdo migrado para cá).

[← Voltar ao início](../README.md)
