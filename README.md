# Webflux and suspend function debugging

In intellij idea evaluating (Cmd + F8 or Option + click) suspended functions while debugging works just fine.
The problem arises in combination with webflux and suspended functions.
Once suspended you cannot evaluate the captured variables any longer.
Error states: `this@HelloController is not captured`

One workaround is to create a `coroutineScope` around an endpoint.
Not sure why this is working at all and have not tested any performance impacts on this.
Searching for a proper way to be able to debug suspended endpoints in intellij with webflux and coroutines.

# Quickstart

- Set breakpoints
  in [HelloController.kt](src%2Fmain%2Fkotlin%2Fcom%2Fexample%2Fwebflux_coroutines_test%2FHelloController.kt)
- Execute tests
  for [HelloControllerTest.kt](src%2Ftest%2Fkotlin%2Fcom%2Fexample%2Fwebflux_coroutines_test%2FHelloControllerTest.kt)
- Evaluate both methods via intellij
    - the one wrapped in a `coroutineContext` is working
    - other one is throwing an error