# Etapa 1: Build da aplicação
FROM node:14.17.0-alpine as builder

WORKDIR /app

COPY package.json package-lock.json ./
RUN npm ci

COPY . .
RUN npm run build

# Etapa 2: Servir os arquivos estáticos
FROM nginx:1.21.1-alpine

COPY --from=builder /app/dist/frontend /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
