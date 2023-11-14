# Imelda Shoes REST App

av Ilyas Mohamud

Imelda Shoes-prosjektet: Kasse- og nettbutikkapplikasjon med REST-integrasjon.
Dette repositoryet inneholder kildekoden for applikasjonen. Strukturert i mapper for front-end, back-end, og testing.

## Informasjon om template

Spring Boot og Spring Framework:

Jeg valgte å bruke Spring Boot fordi det gir meg et raskt oppsett og automatiserer mye av konfigurasjonsarbeidet. Dette gjør utviklingen enklere og lar meg fokusere mer på selve funksjonaliteten.
RESTful Webtjeneste:

Jeg har designet applikasjonen min som en RESTful webtjeneste fordi det gir meg en enkel og standardisert måte å håndtere kommunikasjonen med klienter. Dette er spesielt nyttig for å bygge moderne webapplikasjoner.
Controller-klassen (UserController):

UserController er der jeg håndterer forespørsler fra klienter. Ved å bruke annotasjonen @RestController, kan jeg enkelt opprette API-endepunkter og sende JSON-respons. Dette gir meg en smidig måte å eksponere funksjonaliteten min.
Service-klasser (UserService, ProductService):

Jeg har opprettet UserService og ProductService for å isolere forretningslogikken min. Dette gjør koden min mer modulær og lettere å vedlikeholde. Ved å bruke @Service-annotasjonen, integreres de enkelt med resten av Spring-rammeverket.
REST-prinsipper:

Jeg følger REST-prinsippene som statelessness og enhetlig grensesnitt. Dette gir meg en arkitektur som er enkel å forstå, skalerbar og som integreres godt med andre systemer.

## Prosjektoversikt

Prosjektmalen består av en Java-basert webapplikasjon som spesifikt bruker Spring-rammeverket for å tilby et RESTful API. API-seksjonen inkluderer modellene (Product og User) og tjenestene (ProductService og UserService) for å håndtere forretningslogikk. I tillegg håndterer API-kontrolleren (UserController) HTTP-forespørsler og fungerer som et grensesnitt for operasjoner knyttet til brukere og produkter.

`ProductService` håndterer innhenting av produkter fra en ekstern kilde (simulert gjennom den gitte koden), og `UserController` inkluderer endepunkter for å få tilgang til brukerinformasjon, hente produktinformasjon og sjekke produktstatus via REST-grensesnittet.

## Installasjon

Clone prosjektet fra: [Imelda Shoes REST App](https://github.com/IlyasMohamud/imelda-shoes-rest-app.git)

## Kanban Oversikt

Følg prosjektets fremdrift på Kanban: [Kanban Oversikt](https://trello.com/b/6umAZj7x/imelda-shoes-prosjekt)
