FROM node:12.18.3-alpine As builder
WORKDIR /usr/src/app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run-script build

FROM nginx:1.15.8-alpine
COPY --from=builder /usr/src/app/dist/super-heroes/ /usr/share/nginx/html
