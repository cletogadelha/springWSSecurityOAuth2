package com.cletogadelha.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cletogadelha.entity.Colaborador;
import com.cletogadelha.sevice.ColaboradorService;

@RestController
@RequestMapping("/rest/colaborador")
public class ColaboradorController {
	
	@Autowired
	private ColaboradorService colabService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public  Colaborador getDetalhesColaborador(@PathVariable("id") Integer id) {
		return colabService.getDetalhesColaborador(id);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<Colaborador> getListaColaboradores() {
		return colabService.getListaColaboradores();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Colaborador salvarColaborador(@RequestBody @Valid Colaborador colab){
		return colabService.salvarColaborador(colab);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public Colaborador update(@PathVariable("id") Integer id, @RequestBody @Valid Colaborador colab) {
		return colabService.salvarColaborador(colab);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> deletarColaborador(@PathVariable("id") Integer id){
		colabService.removeColaborador(id);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
	
	
    @RequestMapping(value="/upload", method=RequestMethod.POST)
    public @ResponseBody String handleFileUpload(@RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\cleto\\Desktop\\SpringAngular\\Angular" + file.getName())));
                stream.write(bytes);
                stream.close();
            } catch (Exception e) {
            }
        } else {
        }
        
        return "It Works!!";
    }
    
    
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        return "Hello User!";
    }
}