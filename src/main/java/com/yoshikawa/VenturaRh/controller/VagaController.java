package com.yoshikawa.VenturaRh.controller;


import com.yoshikawa.VenturaRh.models.vagaentities.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.yoshikawa.VenturaRh.models.repository.VagaRepository;
import org.springframework.web.servlet.ModelAndView;


@Controller
//@RequestMapping("/api/vagas/")
public class VagaController {

    @Autowired
    private VagaRepository vr;

    @RequestMapping(value="/cadastrarVaga", method = RequestMethod.GET)
    public String form(){
        return "vaga/formVaga";
    }

    @RequestMapping(value="/cadastrarVaga", method = RequestMethod.POST)
    public String form(Vaga vaga){
        vr.save(vaga);
        return "redirect:cadastrarVaga";
    }

    @RequestMapping("/vagas")
    public ModelAndView listaVagas(){
        ModelAndView mv = new ModelAndView("relatorio");
        Iterable<Vaga> vagas = vr.findAll();
        mv.addObject("vagas", vagas);
        return mv;
    }

    @RequestMapping("/{id}")
    public ModelAndView detalhesVaga(@PathVariable("id") long id){
        Vaga vaga = vr.findById(id);
        ModelAndView mv = new ModelAndView("detalhesVaga");
        mv.addObject("vaga", vaga);
        return mv;
    }

    @RequestMapping("/deletar")
    public String deletarVaga(long id){
        Vaga vaga = vr.findById(id);
        vr.delete(vaga);
        return "redirect:/vagas";
    }
}
   // @Autowired
   // private VagaRepository vagaRepository;

   // @PostMapping
  //  public Vaga novaVaga( Vaga vagaCadastrada) {
  //      //Vaga vagaCadastrada = new Vaga(cargo,especializacao,localTrabalho,salario);
  //      vagaRepository.save(vagaCadastrada);
  //      return vagaCadastrada;
  //  }
    // @GetMapping
    //  public ModelAndView inicio(){
    //      ModelAndView mv = new ModelAndView();
    //     mv.setView("/inicio");
    //      return mv;
    // }



 //   @GetMapping(path= "/tela/obterVagas")
 //   public Iterable<Vaga>obterVagas(){
  //      return vagaRepository.findAll();

//    }

  //  @GetMapping(path = "/cargo/{parteCargo}")
  //  public Iterable<Vaga>obterVagasPorCargo(@PathVariable String parteCargo){
 //       return vagaRepository.findByCargoContaining(parteCargo);

//    }

 //   @PutMapping
  //  public Vaga alterarVaga( Vaga vagaCadastrada) {
 //       vagaRepository.save(vagaCadastrada);
 //       return vagaCadastrada;
 //   }
  //  @DeleteMapping(path = "/{id}")
   // public void excluirVaga(@PathVariable int id){
   //     vagaRepository.deleteById(id);

   // }
