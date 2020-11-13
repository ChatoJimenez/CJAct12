/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjact12;

import java.util.Scanner;

/**
 *
 * @author jesgu
 */
public class CJAct12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        boolean end = false;
        AddressBook addressBook = new AddressBook();
        addressBook.load();
        while (!end){
            System.out.printf("\n\n%s\n%s\n%s\n%s\n%s\n\n%s",
                    "======== MENÚ ========","1. Mostrar todos los contactos",
                    "2. Crear nuevos contactos", "3. Borrar un contacto",
                    "4. Salir", "¿Qué deseas hacer? ");
            switch(s.nextInt()){
                case 1:
                    addressBook.list();
                    break;
                case 2:
                    System.out.print("\nIngresa el teléfono: ");
                    String phone = s.next();
                    System.out.print("Ingresa el nombre: ");
                    String name = s.next();
                    addressBook.create(phone, name);
                    break;
                case 3:
                    System.out.print("\nIngresa el teléfono: ");
                    String contact = s.next();
                    addressBook.delete(contact);
                    break;
                case 4:
                    System.out.println("\nAdiós");
                    addressBook.save();
                    end = true;
                    break;
                default:
                    System.out.println("Por favor, escribe una opción válida");
                    break;
            }
        }
        
    }
    
}
