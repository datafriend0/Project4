FROM node:latest as build

WORKDIR /usr/wlocal/app

COPY ./ /usr/wlocal/app/

RUN npm install

RUN npm run build

FROM nginx:latest

COPY --from=build /usr/local/app/dist/project3angularcab/ /usr/share/nginx/html

EXPOSE 80



