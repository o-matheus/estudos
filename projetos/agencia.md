# Agência

- **Repositório:** https://github.com/o-matheus/agencia (privado)
- **Contexto:** pessoal — construção guiada (tarefas, explicações e revisão)
- **Stack:** Java 25, Spring Boot 4.1.1, Maven Wrapper · Angular 22.2.3 + Angular Material · PostgreSQL 18.6 via Docker Compose · Flyway · Makefile
- **Status:** 🟢 Etapa 1 (T001–T003) concluída — próxima: T004 e T000A/T004A (situação em 30/10/2026)

## O que é
Sistema de gestão de uma agência de viagens que trabalha com emissão de passagens aéreas com milhas. Também é um percurso de aprendizado: eu implemento a aplicação, com tarefas guiadas. LGPD e segurança (OWASP ASVS 5.0.0, meta nível 2) são requisitos desde o início.

## Situação
- ✅ T001 — diagnóstico do ambiente
- ✅ T002 — preparação do ambiente (SDKMAN, nvm, `.sdkmanrc`/`.nvmrc`)
- ✅ T003 — projetos mínimos: backend, frontend, banco no Docker, migração Flyway, `Makefile` e integração `/api/status`
- ⏳ T004 — acesso interno individual e navegação
- ⏳ T000A / T004A — inventário LGPD, matriz ASVS e preparação operacional antes de dados reais

## O que aprendi
Os aprendizados detalhados ficam em `docs/APRENDIZADOS.md` no repositório do projeto. Temas registrados até agora:
- Java, bytecode e Docker (T001)
- Gerenciadores de versão e arquivos locais (T002)
- Controller no Spring Boot e primeiro teste do backend (T003)
- Angular 22 + Material: `npm install` × `npx ng add` (bloco C)
- Rede interna do Docker × porta em loopback, pasta `infra/` e `Makefile` (bloco D)
- Spring Boot 4 + Flyway + PostgreSQL 18 (bloco D)
- `provideHttpClient`, `httpResource`, testes unitários e CORS (bloco E)

## Documentação do projeto (no repositório)
`README.md` · `docs/ANDAMENTO.md` · `docs/ESCOPO.md` · `docs/REGRAS_DO_NEGOCIO.md` · `docs/ARQUITETURA.md` · `docs/tarefas/` · `docs/APRENDIZADOS.md`

[← Voltar aos projetos](README.md)
