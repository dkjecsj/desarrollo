package com.example.demo.service;

import com.example.demo.dto.Palindromo;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServices {

    public Object palabra(Palindromo palindromo) {
        palindromo.setPalabra(palindromo.getPalabra());

        int pos = 0;
        palindromo.setPalabra(palindromo.getPalabra().replaceAll(" ", ""));

        char[] ordenado = palindromo.getPalabra().toCharArray();
        char[] inverso = new char[ordenado.length];

        for (int i = ordenado.length; i > 0; i--) {
            inverso[pos] = ordenado[i - 1];
            pos++;
        }

        String inversoDos = new String(inverso);
        if (palindromo.getPalabra().equals(inversoDos)) {
            return "Symmetric";

        } else {

            return "Asymmetri";
        }

    }

}
