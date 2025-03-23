package UPIIZ.Examen.I.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservaHotel {

    @PostMapping("/listado-hotel")
    public String ListadoHotel() {
        return "ecom_product-list";
    }

    @PostMapping("/")
    public String login() {
        return "loginD";
    }

    @PostMapping("/datatables")
    public String datatables() {
        return "datatables";
    }

    @GetMapping("/ecom_product-add")
    public String addProduct() {
        return "ecom_product-add";
    }

    @GetMapping("/ecom_product-delete")
    public String deleteProduct() {
        return "ecom_product-list";
    }


    @PostMapping("/ecom_list_post")
    public String listPost() {
        return "ecom_product-list";
    }

    @GetMapping("/ecom_list_get")
    public String listGet() {
        return "ecom_product-list";
    }

}
