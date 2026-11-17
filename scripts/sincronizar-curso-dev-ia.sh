#!/bin/sh
# Copia as anotações do curso.dev IA para o repositório central de Estudos.
# Fonte:   ~/ti/curso.dev/clone-tabnews-ia/anotacoes/
# Destino: ~/Documents/Estudos/cursos/curso-dev-ia/anotacoes/
# Uso manual:  sh ~/Documents/Estudos/scripts/sincronizar-curso-dev-ia.sh
SRC="$HOME/ti/curso.dev/clone-tabnews-ia/anotacoes/"
DEST="$HOME/Documents/Estudos/cursos/curso-dev-ia/anotacoes/"
if [ -d "$SRC" ] && [ -d "$DEST" ]; then
  rsync -a --delete "$SRC" "$DEST" && echo "📚 Anotações do curso.dev IA copiadas para Estudos"
else
  echo "⚠️  Pasta de origem ou destino não encontrada — nada foi copiado."
fi
exit 0
