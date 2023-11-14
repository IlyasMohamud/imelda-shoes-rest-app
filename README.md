# Imelda Shoes REST App

av Ilyas Mohamud

Imelda Shoes-prosjektet: Kasse- og nettbutikkapplikasjon med REST-integrasjon.
Dette repositoryet inneholder kildekoden for applikasjonen. Strukturert i mapper for front-end, back-end, og testing.

## Informasjon om template
### Spring Boot og Spring Framework:
- Prosjektet bruker Spring Boot, et rammeverk som forenkler oppsettet og konfigurasjonen av Spring-baserte applikasjoner.

### RESTful Webtjeneste:
- Applikasjonen er designet som en RESTful webtjeneste, og følger prinsippene om ressurser, URI og HTTP-metoder.

### Controller-klassen (`UserController`):
- `UserController` er en del av Spring MVC-arkitekturen og fungerer som en kontroller for å håndtere HTTP-forespørsler.
- Den er annotert med `@RestController` for å indikere at den behandler REST-forespørsler og gir JSON-respons.

### Service-klasser (`UserService`, `ProductService`):
- `UserService` og `ProductService` håndterer forretningslogikken for brukere og produkter, henholdsvis.
- De er annotert med `@Service` og kan injiseres i andre komponenter.

### Modellklasser (`User`, `Shoe`, `Orders`):
- Modellklassene representerer objekter i systemet og implementerer `ProductInterface`.

### REST Endepunkter:
- REST-endepunkter er definert ved hjelp av annotasjoner som `@GetMapping` og `@PostMapping`.
- For eksempel svarer `/user/{id}` på GET-forespørsler for brukerinformasjon basert på brukerens ID.

### Dependency Injection (`@Autowired`):
- Spring bruker avhengighetsinjeksjon ved å bruke annotasjonen `@Autowired` for å injisere `UserService` og `ProductService` i `UserController`.

### REST-prinsipper:
- Prosjektet følger REST-prinsippene, som gir en enkel og skalerbar arkitektur for webtjenesten.

## Installasjon

Clone prosjektet fra: [Imelda Shoes REST App](https://github.com/IlyasMohamud/imelda-shoes-rest-app.git)

## Kanban Oversikt

Følg prosjektets fremdrift på Kanban: [Kanban Oversikt](https://trello.com/b/6umAZj7x/imelda-shoes-prosjekt)
