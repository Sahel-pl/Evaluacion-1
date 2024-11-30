/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sesion4.controller;
  import com.example.sesion4.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


 
@Controller
public class ProductoController {
    

    @GetMapping("/producto/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "registro_producto";
    }

    @PostMapping("/producto/registro")
    public String registrarProducto(@ModelAttribute Producto producto, Model model) {
        model.addAttribute("producto", producto);
        return "registro_exitoso";
    }
}

