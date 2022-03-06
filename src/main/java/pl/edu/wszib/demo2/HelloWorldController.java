package pl.edu.wszib.demo2;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/helloworld")
@RestController
public class HelloWorldController {

    @GetMapping("/get/{asdf}/prefix/{super}")
    public String helloWorld(@PathVariable("asdf") String param,
                             @PathVariable("super") String param2) {
        return "Hello World" + param + param2;
    }

    @GetMapping("upper/{tekst}")
    public String upper(@PathVariable String tekst) {
        return tekst.toUpperCase();
    }

    @PostMapping("/param2")
    public String wypisz(@RequestParam(value = "test", required = false) String[] param) {
        String out = "";
        for (String t : param) {
            out += t;
        }
        return out;
    }

    public static class ObiektDoWyslania {
        private int number;
        private String tekst;
        private float zmiennoprzecinkowa;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getTekst() {
            return tekst;
        }

        public void setTekst(String tekst) {
            this.tekst = tekst;
        }

        public float getZmiennoprzecinkowa() {
            return zmiennoprzecinkowa;
        }

        public void setZmiennoprzecinkowa(float zmiennoprzecinkowa) {
            this.zmiennoprzecinkowa = zmiennoprzecinkowa;
        }

        @Override
        public String toString() {
            return "ObiektDoWyslania{" +
                    "number=" + number +
                    ", tekst='" + tekst + '\'' +
                    ", zmiennoprzecinkowa=" + zmiennoprzecinkowa +
                    '}';
        }
    }
    @GetMapping("/obiekt")
    public String dodajObiekt(@RequestParam ObiektDoWyslania obiekt) {
        return obiekt.number + obiekt.tekst + obiekt.zmiennoprzecinkowa;
    }

    @PatchMapping
    public String wypisz2(@RequestBody ObiektDoWyslania param) {
        return "Hello Universe ->" + param;
    }

    @PutMapping
    public String upgrade(@RequestHeader("Authorization") String param) {
        return "Hello PUT" + param;
    }

    @DeleteMapping
    public String delete() {
        throw new MojWyjatek();
    }
}
