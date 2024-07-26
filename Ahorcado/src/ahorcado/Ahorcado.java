package ahorcado;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class Ahorcado extends JFrame implements ActionListener{
    ImageIcon imagen=new ImageIcon("1.png");
    JButton resp=new JButton("Respuesta");
    JButton nueva=new JButton("Nueva");
    JButton salir=new JButton("Salir");
    JTextField palabra=new JTextField("",25);
    JButton a=new JButton("A");
    JButton b=new JButton("B");
    JButton c=new JButton("C");
    JButton d=new JButton("D");
    JButton e=new JButton("E");
    JButton f=new JButton("F");
    JButton g=new JButton("G");
    JButton h=new JButton("H");
    JButton i=new JButton("I");
    JButton j=new JButton("J");
    JButton k=new JButton("K");
    JButton l=new JButton("L");
    JButton m=new JButton("M");
    JButton n=new JButton("N");
    //JButton ñ=new JButton("Ñ");
    JButton o=new JButton("O");
    JButton p=new JButton("P");
    JButton q=new JButton("Q");
    JButton r=new JButton("R");
    JButton s=new JButton("S");
    JButton t=new JButton("T");
    JButton u=new JButton("U");
    JButton v=new JButton("V");
    JButton w=new JButton("W");
    JButton x=new JButton("X");
    JButton y=new JButton("Y");
    JButton z=new JButton("Z");
    JLabel img=new JLabel(imagen);
    Panel panel=new Panel();
    Panel pa=new Panel();
    Panel pa1=new Panel();
    Panel pa2=new Panel();
    Panel pb=new Panel();
    String respuesta;
    int intentos=0;
    
    public Ahorcado(){
        this.setTitle("Ahorcado");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        palabra.setEditable(false);
        img.setIcon(imagen);
        panel.setLayout(new GridLayout(1,2,20,20));
        panel.add(pa);
        panel.add(pb);
        pa1.setLayout(new GridLayout(4,1,2,20));
        pa1.add(resp);
        pa1.add(nueva);
        pa1.add(salir);
        pa1.add(palabra);
        pa2.add(img);
        pa.setLayout(new GridLayout(2,1,0,0));
        pa.add(pa1);
        pa.add(pa2);
        pb.setLayout(new GridLayout(3,9,0,0));
        pb.add(a);
        pb.add(b);
        pb.add(c);
        pb.add(d);
        pb.add(e);
        pb.add(f);
        pb.add(g);
        pb.add(h);
        pb.add(i);
        pb.add(j);
        pb.add(k);
        pb.add(l);
        pb.add(m);
        pb.add(n);
        //pb.add(ñ);
        pb.add(o);
        pb.add(p);
        pb.add(q);
        pb.add(r);
        pb.add(s);
        pb.add(t);
        pb.add(u);
        pb.add(v);
        pb.add(w);
        pb.add(x);
        pb.add(y);
        pb.add(z);
        this.add(panel);
        this.add(pa);
        this.add(pa1);
        this.add(pa2);
        this.add(pb);
        
        salir.addActionListener(this);
        nueva.addActionListener(this);
        resp.addActionListener(this);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        h.addActionListener(this);
        i.addActionListener(this);
        j.addActionListener(this);
        k.addActionListener(this);
        l.addActionListener(this);
        m.addActionListener(this);
        n.addActionListener(this);
        //ñ.addActionListener(this);
        o.addActionListener(this);
        p.addActionListener(this);
        q.addActionListener(this);
        r.addActionListener(this);
        s.addActionListener(this);
        t.addActionListener(this);
        u.addActionListener(this);
        v.addActionListener(this);
        w.addActionListener(this);
        x.addActionListener(this);
        y.addActionListener(this);
        z.addActionListener(this);
    }
    
    public void accion(JButton bot){
        bot.setEnabled(false);
        int lon=respuesta.length(),in=0;
        char ca[]=new char[25];
        char nc[]=new char[40];
        String pa=palabra.getText(),pu=bot.getText();
        pu=pu.toLowerCase();
        nc=pa.toCharArray();
        ca=respuesta.toCharArray();
        if(respuesta.contains(pu)){
            if(pu.equals("a")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='a'){
                        nc[in]='a';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("b")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='b'){
                        nc[in]='b';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("c")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='c'){
                        nc[in]='c';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("d")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='d'){
                        nc[in]='d';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("e")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='e'){
                        nc[in]='e';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("f")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='f'){
                        nc[in]='f';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("g")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='g'){
                        nc[in]='g';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("h")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='h'){
                        nc[in]='h';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("i")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='i'){
                        nc[in]='i';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("j")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='j'){
                        nc[in]='j';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("k")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='k'){
                        nc[in]='k';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("l")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='l'){
                        nc[in]='l';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("m")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='m'){
                        nc[in]='m';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("n")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='n'){
                        nc[in]='n';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            /*if(pu.equals("ñ")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='ñ'){
                        nc[in]='ñ';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }*/
            if(pu.equals("o")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='o'){
                        nc[in]='o';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("p")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='p'){
                        nc[in]='p';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("q")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='q'){
                        nc[in]='q';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("r")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='r'){
                        nc[in]='r';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("s")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='s'){
                        nc[in]='s';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("t")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='t'){
                        nc[in]='t';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("u")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='u'){
                        nc[in]='u';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("v")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='v'){
                        nc[in]='v';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("w")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='w'){
                        nc[in]='w';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("x")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='x'){
                        nc[in]='x';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("y")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='y'){
                        nc[in]='y';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            if(pu.equals("z")){
                for(int i=0; i<lon; i++){
                    if(ca[i]=='z'){
                        nc[in]='z';
                    }else{
                        nc[in]=nc[in];
                    }
                    in+=2;
                }
            }
            palabra.setText(String.valueOf(nc));
        }
        else{
            intentos+=1;
            this.tipo();
        }
        this.busca();
    }
    
    public void reinicia(){
        String cadena,cad="";
        ArrayList <String> cadenas=new ArrayList();
        Random ran=new Random();
        int in=0,jo=0;
        try{
            Lectura l=new Lectura("Palabras.txt");
            cadenas=l.leer();
            int dim=cadenas.size();
            in=ran.nextInt(dim);
            cadena=cadenas.get(in);
            respuesta=cadena;
            jo=cadena.length();
            for(int n=0; n<jo;n++){
                cad=cad+"_"+" ";
            }
            palabra.setText(cad);
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null,"¡Archivo no encontrado!","Error",JOptionPane.ERROR_MESSAGE);
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null,"¡Error con el archivo!","Error",JOptionPane.ERROR_MESSAGE);
        }
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        g.setEnabled(true);
        h.setEnabled(true);
        i.setEnabled(true);
        j.setEnabled(true);
        k.setEnabled(true);
        l.setEnabled(true);
        m.setEnabled(true);
        n.setEnabled(true);
        //ñ.setEnabled(true);
        o.setEnabled(true);
        p.setEnabled(true);
        q.setEnabled(true);
        r.setEnabled(true);
        s.setEnabled(true);
        t.setEnabled(true);
        u.setEnabled(true);
        v.setEnabled(true);
        w.setEnabled(true);
        x.setEnabled(true);
        y.setEnabled(true);
        z.setEnabled(true);
        img.setIcon(imagen=new ImageIcon("1.png"));
        intentos=0;
    }
    
    public void tipo(){
        if(intentos==1){
            img.setIcon(imagen=new ImageIcon("2.png"));
        }
        if(intentos==2){
            img.setIcon(imagen=new ImageIcon("3.png"));
        }
        if(intentos==3){
            img.setIcon(imagen=new ImageIcon("4.png"));
        }
        if(intentos==4){
            img.setIcon(imagen=new ImageIcon("5.png"));
        }
        if(intentos==5){
            img.setIcon(imagen=new ImageIcon("6.png"));
        }
        if(intentos==6){
            img.setIcon(imagen=new ImageIcon("7.png"));
        }
        if(intentos>=7){
            img.setIcon(imagen=new ImageIcon("8.png"));
            JOptionPane.showMessageDialog(null,"Lo siento no adivinaste la palabra :( \nLa respuesta era: "+respuesta,"Perdiste",JOptionPane.INFORMATION_MESSAGE);
            this.reinicia();
        }
    }
    
    public void busca(){
        String pa=palabra.getText();
        if(pa.contains("_")){}
        else{
            JOptionPane.showMessageDialog(null,"¡Felicidades, Ganaste!","Ganador",JOptionPane.INFORMATION_MESSAGE);
            this.reinicia();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ev){
        try{
        if(ev.getSource()==salir){
            int opc=JOptionPane.showConfirmDialog(null,"¿Seguro que desea Salir?","Salir",JOptionPane.OK_CANCEL_OPTION);
            if(opc==0){
                //JOptionPane.showConfirmDialog(null,"¡Hasta Luego!","Salir",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
        }
        if(ev.getSource()==nueva){
            this.reinicia();
        }
        if(ev.getSource()==resp){
            //JOptionPane.showMessageDialog(null,"La respuesta es: "+respuesta,"Respuesta",JOptionPane.INFORMATION_MESSAGE);
            if(palabra.getText().equals("")){
                throw new PalabraException();
            }else{
            palabra.setText(respuesta);
            a.setEnabled(false);
            b.setEnabled(false);
            c.setEnabled(false);
            d.setEnabled(false);
            e.setEnabled(false);
            f.setEnabled(false);
            g.setEnabled(false);
            h.setEnabled(false);
            i.setEnabled(false);
            j.setEnabled(false);
            k.setEnabled(false);
            l.setEnabled(false);
            m.setEnabled(false);
            n.setEnabled(false);
            //ñ.setEnabled(false);
            o.setEnabled(false);
            p.setEnabled(false);
            q.setEnabled(false);
            r.setEnabled(false);
            s.setEnabled(false);
            t.setEnabled(false);
            u.setEnabled(false);
            v.setEnabled(false);
            w.setEnabled(false);
            x.setEnabled(false);
            y.setEnabled(false);
            z.setEnabled(false);
            //this.reinicia();
            }
        }
        
        if(ev.getSource()==a){
            this.accion(a);
        }
        if(ev.getSource()==b){
            this.accion(b);
        }
        if(ev.getSource()==c){
            this.accion(c);
        }
        if(ev.getSource()==d){
            this.accion(d);
        }
        if(ev.getSource()==e){
            this.accion(e);
        }
        if(ev.getSource()==f){
            this.accion(f);
        }
        if(ev.getSource()==g){
            this.accion(g);
        }
        if(ev.getSource()==h){
            this.accion(h);
        }
        if(ev.getSource()==i){
            this.accion(i);
        }
        if(ev.getSource()==j){
            this.accion(j);
        }
        if(ev.getSource()==k){
            this.accion(k);
        }
        if(ev.getSource()==l){
            this.accion(l);
        }
        if(ev.getSource()==m){
            this.accion(m);
        }
        if(ev.getSource()==n){
           this.accion(n);
        }
        /*if(ev.getSource()==ñ){
           this.accion(ñ);
        }*/
        if(ev.getSource()==o){
            this.accion(o);
        }
        if(ev.getSource()==p){
            this.accion(p);
        }
        if(ev.getSource()==q){
            this.accion(q);
        }
        if(ev.getSource()==r){
            this.accion(r);
        }
        if(ev.getSource()==s){
            this.accion(s);
        }
        if(ev.getSource()==t){
            this.accion(t);
        }
        if(ev.getSource()==u){
            this.accion(u);
        }
        if(ev.getSource()==v){
            this.accion(v);
        }
        if(ev.getSource()==w){
            this.accion(w);
        }
        if(ev.getSource()==x){
            this.accion(x);
        }
        if(ev.getSource()==y){
            this.accion(y);
        }
        if(ev.getSource()==z){
            this.accion(z);
        }
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null,"¡No hay ninguna palabra!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        Ahorcado a=new Ahorcado();
    }
    
}
