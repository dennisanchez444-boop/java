package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {

    private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private int indiceActual;

    public Juego(ArrayList<String> listaJugadores) {
        naipe = new Naipe();
        naipeBarajado = naipe.barajar();
        cartasJugadores = new ArrayList<>();
        indiceActual = 0;
        inicializarJugadores(listaJugadores.size());

    }


    public void inicializarJugadores(int numeroJugadores) {
        cartasJugadores.clear();

        for (int i = 0; i < numeroJugadores; i++) {
            cartasJugadores.add(new ArrayList<Carta>());
        }
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    public void entregarCartas(int cartasPorJugador) {

        for (int ronda = 0; ronda < cartasPorJugador; ronda++) {

            for (int jugador = 0; jugador < cartasJugadores.size(); jugador++) {

                if (indiceActual < naipeBarajado.size()) {

                    cartasJugadores.get(jugador).add(
                        naipeBarajado.get(indiceActual)
                    );

                    indiceActual++;
                }
            }
        }
    }
    
    public int devolverTotal(int idJugador) {
        int suma = 0;
        ArrayList<Carta> cartas = cartasJugadores.get(idJugador);

        for (int i = 0; i < cartas.size(); i++) {
            Carta c = cartas.get(i);
            suma += c.getNumero().getValor();
        }

        return suma;
    }

    public String determinarGanador() {
        int idGanador = 0;
        int sumaGanador = devolverTotal(0);

        for (int i = 1; i < cartasJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);
            if (sumaActual >= sumaGanador) {
                sumaGanador = sumaActual;
                idGanador = i;
            }
        }

        return "Jugador " + (idGanador + 1);
    }
}