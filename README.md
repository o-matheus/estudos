# 📚 Estudos

Central de anotações de tudo o que eu estudo: cursos, faculdade, temas avulsos e aprendizados de projetos.
Tudo em Markdown, versionado no GitHub.

## Estrutura

```
Estudos/
├── README.md          ← você está aqui (índice geral)
├── AGENTS.md          ← regras para assistentes de IA (Claude, Codex, Gemini/Antigravity)
├── _templates/        ← modelos prontos para copiar
├── cursos/            ← cursos livres (bolsa, pagos ou gratuitos)
├── faculdade/         ← Engenharia de Software, por período e disciplina
├── concurso/          ← concursos públicos, por ano da prova
├── topicos/           ← base de conhecimento por tema (conteúdo avulso / extra)
├── projetos/          ← fichas dos projetos (as notas detalhadas ficam no repo de cada projeto)
└── scripts/           ← scripts de sincronização (ex.: anotações do curso.dev IA)
```

## Acesso rápido

| Seção | Conteúdo |
|---|---|
| [Cursos](cursos/README.md) | [Residência TIC 16 (UNILAB)](cursos/residencia-tic-unilab/README.md) · [curso.dev Web](cursos/curso-dev-programacao-web/README.md) · [curso.dev IA](cursos/curso-dev-ia/README.md) |
| [Faculdade](faculdade/README.md) | Períodos 01 a 05 |
| [Concurso](concurso/README.md) | [2027 — Prefeitura de Boa Viagem (Programador – T.I.)](concurso/2027/prefeitura-boa-viagem/README.md) |
| [Tópicos](topicos/README.md) | — |
| [Projetos](projetos/README.md) | [Ordum](projetos/ordum.md) · [Agência](projetos/agencia.md) · [Clone TabNews](projetos/clone-tabnews.md) |

## Onde colocar cada coisa?

| Estou estudando... | Vai para |
|---|---|
| Aula/módulo/dia de um curso online | `cursos/<nome-do-curso>/anotacoes/` |
| Aula, trabalho ou prova da faculdade | `faculdade/periodo-NN/<disciplina>/` |
| Material de concurso (pesquisado/gerado) | `concurso/<ano>/<concurso>/conteudo-base/` |
| O que eu entendi estudando para concurso | `concurso/<ano>/<concurso>/anotacoes/AAAA-MM-DD.md` |
| Artigo, vídeo, livro, documentação solta | `topicos/<tema>/` |
| Um tema que apareceu em vários lugares (ex.: Requisitos na Residência **e** na faculdade) | `topicos/<tema>/` — resumo consolidado, com links para as notas de origem |
| Algo que aprendi construindo um projeto | ficha em `projetos/` + notas no próprio repo do projeto |

**Regra de ouro:** a nota nasce onde eu estudei (curso ou faculdade). Quando um assunto cresce e se repete, ele ganha uma página em `topicos/` que liga tudo.

## Convenções

- **Nomes de pastas e arquivos:** minúsculas, sem acentos, com hífen → `estrutura-de-dados`, `01-introducao.md`
- **Nomes oficiais** (de disciplinas e cursos) ficam dentro dos documentos, com acentos.
- **Cada pasta de curso/disciplina/tópico tem um `README.md`** que funciona como índice dela.
- **Status:** `🟢 em andamento` · `⏸️ pausado` · `✅ concluído` · `📌 quero fazer`
- **Links entre notas:** links relativos do Markdown → `[Dia 003](cursos/curso-dev-programacao-web/anotacoes/dia-003.md)`

## Começando algo novo

1. Crie a pasta no lugar certo (tabela acima).
2. Copie o template de `_templates/` como `README.md` dessa pasta.
3. Adicione uma linha no índice da seção (`cursos/README.md`, `faculdade/README.md`...).

## Sincronizar com o GitHub

```bash
git add .
git commit -m "notas: <o que estudei>"
git push
```
