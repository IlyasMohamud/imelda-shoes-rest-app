# Imelda Shoes REST App
av Ilyas Mohamud

Imelda Shoes-prosjektet: Kasse- og nettbutikkapplikasjon med REST-integrasjon. 
Dette repositoryet inneholder kildekoden for applikasjonen. Strukturert i mapper for front-end, back-end, og testing.

## Informasjon om template
Product.java: Inneholder modellen som representerer et produkt med attributter og metoder for å håndtere produktinformasjon, inkludert funksjonalitet for statussporing.
User.java: Representerer modellen for brukere som samhandler med systemet og inneholder brukerrelatert informasjon.
ProductService.java: Håndterer innhenting av produkter fra en ekstern kilde (simulert) og sjekker produktstatus ved dagsslutt.
UserService.java: Gir funksjonalitet relatert til brukeradministrasjon og informasjonshenting.
UserController.java: Kontrollerer HTTP-forespørsler knyttet til brukere og produkter, og gir endepunkter for å hente brukerinformasjon, hente produkter og sjekke produktstatus.
application.properties: Konfigurasjonsfil for Spring Boot-applikasjonsinnstillinger.
Prosjektoversikt:
Prosjektmalen består av en Java-basert webapplikasjon som spesifikt bruker Spring-rammeverket. API-seksjonen inkluderer modellene (Product og User) og tjenestene (ProductService og UserService) for å håndtere forretningslogikk. I tillegg håndterer API-kontrolleren (UserController) HTTP-forespørsler og fungerer som et grensesnitt for operasjoner knyttet til brukere og produkter.

ProductService håndterer innhenting av produkter fra en ekstern kilde (simulert gjennom den gitte koden), og UserController inkluderer endepunkter for å få tilgang til brukerinformasjon, hente produktinformasjon og sjekke produktstatus. 

## Installasjon
Clone prosjektet fra: [Imelda Shoes REST App](https://github.com/IlyasMohamud/imelda-shoes-rest-app.git)

## Kanban Oversikt
Følg prosjektets fremdrift på Kanban: [Kanban Oversikt](https://trello.com/b/6umAZj7x/imelda-shoes-prosjekt)




