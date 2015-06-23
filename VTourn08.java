import java.awt.*;

public class VTourn08 extends java.applet.Applet
  implements Runnable
  {

  final double[] Sin_in_PI =    // 0 to 160PI/80
    {
    0.000000000, // 0 PI / 80
    0.039259816, // 1 PI / 80
    0.078459096,
    0.117537397,
    0.156434465,
    0.195090322,
    0.233445364,
    0.271440450,
    0.309016994,
    0.346117057,
    0.382683432, // 10 PI / 80
    0.418659738,
    0.453990500,
    0.488621241,
    0.522498565,
    0.555570233,
    0.587785252,
    0.619093949,
    0.649448048,
    0.678800746,
    0.707106781, // 20 PI / 80
    0.734322509,
    0.760405966,
    0.785316931,
    0.809016994,
    0.831469612,
    0.852640164,
    0.872496007,
    0.891006524,
    0.908143174,
    0.923879533, // 30 PI /80
    0.938191336,
    0.951056516,
    0.962455236,
    0.972369920,
    0.980785280,
    0.987688341,
    0.993068457,
    0.996917334,
    0.999229036,
    1.000000000, // 40 PI / 80
    0.999229036,
    0.996917334,
    0.993068457,
    0.987688341,
    0.980785280,
    0.972369920,
    0.962455236,
    0.951056516,
    0.938191336,
    0.923879533, // 50 PI /80
    0.908143174,
    0.891006524,
    0.872496007,
    0.852640164,
    0.831469612,
    0.809016994,
    0.785316931,
    0.760405966,
    0.734322509,
    0.707106781, // 60 PI / 80
    0.678800746,
    0.649448048,
    0.619093949,
    0.587785252,
    0.555570233,
    0.522498565,
    0.488621241,
    0.453990500,
    0.418659738,
    0.382683432, // 70 PI / 80
    0.346117057,
    0.309016994,
    0.271440450,
    0.233445364,
    0.195090322,
    0.156434465,
    0.117537397,
    0.078459096,
    0.039259816, // 79 PI / 80
    0.000000000, // 80 PI / 80
   -0.039259816, // 81 PI / 80
   -0.078459096,
   -0.117537397,
   -0.156434465,
   -0.195090322,
   -0.233445364,
   -0.271440450,
   -0.309016994,
   -0.346117057,
   -0.382683432, // 90 PI / 80
   -0.418659738,
   -0.453990500,
   -0.488621241,
   -0.522498565,
   -0.555570233,
   -0.587785252,
   -0.619093949,
   -0.649448048,
   -0.678800746,
   -0.707106781, // 100 PI / 80
   -0.734322509,
   -0.760405966,
   -0.785316931,
   -0.809016994,
   -0.831469612,
   -0.852640164,
   -0.872496007,
   -0.891006524,
   -0.908143174,
   -0.923879533, // 110 PI /80
   -0.938191336,
   -0.951056516,
   -0.962455236,
   -0.972369920,
   -0.980785280,
   -0.987688341,
   -0.993068457,
   -0.996917334,
   -0.999229036,
   -1.000000000, // 120 PI / 80
   -0.999229036,
   -0.996917334,
   -0.993068457,
   -0.987688341,
   -0.980785280,
   -0.972369920,
   -0.962455236,
   -0.951056516,
   -0.938191336,
   -0.923879533, // 130 PI /80
   -0.908143174,
   -0.891006524,
   -0.872496007,
   -0.852640164,
   -0.831469612,
   -0.809016994,
   -0.785316931,
   -0.760405966,
   -0.734322509,
   -0.707106781, // 140 PI / 80
   -0.678800746,
   -0.649448048,
   -0.619093949,
   -0.587785252,
   -0.555570233,
   -0.522498565,
   -0.488621241,
   -0.453990500,
   -0.418659738,
   -0.382683432, // 150 PI / 80
   -0.346117057,
   -0.309016994,
   -0.271440450,
   -0.233445364,
   -0.195090322,
   -0.156434465,
   -0.117537397,
   -0.078459096,
   -0.039259816, // 159 PI / 80
   -0.000000000, // 160 PI / 80
    0.039259816, // 161 PI / 80
    0.078459096,
    0.117537397,
    0.156434465,
    0.195090322,
    0.233445364,
    0.271440450,
    0.309016994,
    0.346117057,
    0.382683432, // 170 PI / 80
    0.418659738,
    0.453990500,
    0.488621241,
    0.522498565,
    0.555570233,
    0.587785252,
    0.619093949,
    0.649448048,
    0.678800746,
    0.707106781, // 180 PI / 80
    0.734322509,
    0.760405966,
    0.785316931,
    0.809016994,
    0.831469612,
    0.852640164,
    0.872496007,
    0.891006524,
    0.908143174,
    0.923879533, // 190 PI /80
    0.938191336,
    0.951056516,
    0.962455236,
    0.972369920,
    0.980785280,
    0.987688341,
    0.993068457,
    0.996917334,
    0.999229036,
    1.000000000, // 200 PI / 80
    };
  static int real_value_int_array[] = {
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
  };
  int imaginary_value_int_array[] = {
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
  };
  static double e_at_n_tenth_array[] = {
    0.367879441,  // e^-1.0
    0.406569660,  // e^-0.9
    0.449328964,  // e^-0.8
    0.496585304,
    0.548811636,
    0.606530660,
    0.670320046,
    0.740818221,
    0.818730753,
    0.904837418,  // e^-0.1
    1.000000000,  // e^ 0.0
    1.105170918,  // e^ 0.1
    1.221402758,
    1.349858808,
    1.491824698,
    1.648721271,
    1.822118800,
    2.013752707,
    2.225540928,
    2.459603111, // e^ 0.9
    2.718281828  // e^ 1.0
  };

  board3DClass blackBoard3D;
  allControlsClass rightZone;

  int amplitudeLogValeurNow;
  double amplitudeValeurNow;
  int amplitudeLogAnimationNow;
  double amplitudeAnimationNow;
  int sigmaValeurNow;
  int sigmaAnimationNow;
  int omegaValeurNow;
  int omegaAnimationNow;
  int timeValeurNow;
  int timeAnimationNow;

  int refreshTimeValeurNow=1500;

  boolean omegaUnitesIsInPI = true;

  int temp=10;
  Thread runner;

  public void start()
    {
    if (runner == null)
      {
      runner = new Thread(this);
      runner.start();
      }
    }
  public void stop()
    {
    if (runner != null)
      {
      runner.stop();
      runner=null;
      }
    }

  public void run()
    {
    double amplitude_a_t_egal_0;
    int t_coordinate;
    int pas_en_t;
    int indice_actuel;
    while (true)
      {
      amplitude_a_t_egal_0 = 20 * amplitudeValeurNow;
      pas_en_t = omegaValeurNow;
      indice_actuel=(-160*pas_en_t);
      while (indice_actuel >= 1600 ) indice_actuel -= 1600;
      while (indice_actuel < 0 ) indice_actuel += 1600;
      //System.out.println("indice_actuel = " + indice_actuel);

      temp+=20;
      if (temp > 400) temp = 0;
      amplitudeLogValeurNow+=amplitudeLogAnimationNow;
      amplitudeValeurNow=1;
      sigmaValeurNow+=sigmaAnimationNow;
      omegaValeurNow+=omegaAnimationNow;

      timeValeurNow+=timeAnimationNow;
      if ((pas_en_t >=160 ) || (pas_en_t <=-160 ))
      // data has now no signification !
      ;
      //   for(x_coordinate = 0 ; x_coordinate < 320; x_coordinate++)
      //    {
      //    g.drawLine(x_coordinate, (int)(50+20 /* amplitude_a_t_egal_0 */ ),x_coordinate, (int)(50-20));
      //    }
      else
        for (t_coordinate = 0; t_coordinate < 320; t_coordinate++)
          {
          while (indice_actuel >=  1600 ) indice_actuel -= 1600;
          while (indice_actuel < 0 ) indice_actuel += 1600;
          real_value_int_array[t_coordinate] = (int)(e_a_n_millieme(sigmaValeurNow*(t_coordinate-160)) *20 /*amplitude_a_t_egal_0*/ * Sin_in_PI[(int)(indice_actuel*0.1)+40]);
          imaginary_value_int_array[t_coordinate] = (int)(e_a_n_millieme(sigmaValeurNow*(t_coordinate-160)) * 20 /*amplitude_a_t_egal_0*/ * Sin_in_PI[(int)(indice_actuel*0.1)]);
          indice_actuel += pas_en_t;
          }

      repaint();
      try { Thread.sleep(refreshTimeValeurNow);}
      catch ( InterruptedException e) {}
//      System.out.println("real_value_int_array[0] = " + real_value_int_array[0]);
      } // end while (true)
    } // end public void start()

  public void init()
    {
     setLayout(new GridLayout(1,2,10,10));
     rightZone = new allControlsClass(this);
     blackBoard3D = new board3DClass(this);
     blackBoard3D.setBackground(Color.black);
     add(blackBoard3D);
     add(rightZone);
    } // end of function init() of class VTourn??

  public Insets insets()
    {
    return new Insets(1,1,1,1);
    }

  public void paint(Graphics g)
    {
    blackBoard3D.repaint();
    rightZone.repaint();
    g.setColor(new Color(200,255,0));
    g.drawLine(25,temp,400,200);
    } // end paint()

  private double e_a_n_millieme(int in)
    {
    int trunc_of_in = ((int)(in *0.01)) * 100;
    int trunc_of_in_div_by_100 = (int)(in *0.01);
    if ( in == 0) return 1.0;
    else if ( in > 0) return (((in - trunc_of_in)*0.01*e_at_n_tenth(trunc_of_in_div_by_100+1))+((trunc_of_in+100 - in)*0.01*e_at_n_tenth(trunc_of_in_div_by_100)));
    else return (((in - trunc_of_in)*0.01*e_at_n_tenth(trunc_of_in_div_by_100+1))+((trunc_of_in+100 - in)*0.01*e_at_n_tenth(trunc_of_in_div_by_100)));
    }

  private double e_at_n_tenth(int in)
    {
    if (in > 10)  return (e_at_n_tenth( in-10 )*2.718281828);
    else if (in < -10)  return (e_at_n_tenth( in+10 )*0.367879441);
    else return e_at_n_tenth_array[in + 10];
    } // end e_at_n_tenth


  } //  end of class VTourn??


//
class   board3DClass       extends Panel
  {

  VTourn08 topParent;

  board3DClass       (VTourn08 topParentPassing)
    {
    this.topParent= topParentPassing;
    }

  public void paint(Graphics g)
    {
    int t_coordinate;
    int last_real_value= topParent.real_value_int_array[0];
    int last_imaginary_value= topParent.imaginary_value_int_array[0];
    int this_real_value=0;
    int this_imaginary_value=0;

    // real axis
    g.setColor(new Color(128,32,32));
    g.drawLine(170,300, 115, 300);
    g.drawLine(115,300, 130, 303);
    g.drawLine(130,303, 130, 297);
    g.drawLine(130,297, 115, 300);
    // imaginary axis
    g.setColor(new Color(32,128,32));
    g.drawLine(160,310, 160, 255);
    g.drawLine(160,255, 163, 270);
    g.drawLine(163,270, 157, 270);
    g.drawLine(157,270, 160, 255);
    // time axis
    g.setColor(Color.darkGray);
    g.drawLine(135,313,236,262);
    g.drawLine(236,262,201,283);
    g.drawLine(201,283,201,276);
    g.drawLine(201,276,236,262);
    // draw complexe exponential
    g.setColor(Color.lightGray);

    if ((topParent.omegaValeurNow>=-1600) && (topParent.omegaValeurNow<=1600))
      {
      for (t_coordinate= 1; t_coordinate < 320; t_coordinate ++)
        {
        this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
        this_real_value = topParent.real_value_int_array[t_coordinate];
        g.drawLine(160-last_real_value+((t_coordinate-1-160)>>1),300-last_imaginary_value-((t_coordinate-1-160)>>2),160-this_real_value+((t_coordinate-160)>>1),300-this_imaginary_value-((t_coordinate-160)>>2));
        last_imaginary_value = this_imaginary_value ;
        last_real_value = this_real_value ;
        }
      }
    // draw the present time:
    g.setColor(Color.white);
    t_coordinate=topParent.timeValeurNow+160;
    if ((t_coordinate >= 0) && (t_coordinate < 320))
      {
      this_real_value = topParent.real_value_int_array[t_coordinate];
      this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
      g.drawLine(160-this_real_value+((t_coordinate-160)>>1)-2,300-this_imaginary_value-((t_coordinate-160)>>2)-2,160-this_real_value+((t_coordinate-160)>>1)+2,300-this_imaginary_value-((t_coordinate-160)>>2)-2);
      g.drawLine(160-this_real_value+((t_coordinate-160)>>1)+2,300-this_imaginary_value-((t_coordinate-160)>>2)-2,160-this_real_value+((t_coordinate-160)>>1)+2,300-this_imaginary_value-((t_coordinate-160)>>2)+2);
      g.drawLine(160-this_real_value+((t_coordinate-160)>>1)+2,300-this_imaginary_value-((t_coordinate-160)>>2)+2,160-this_real_value+((t_coordinate-160)>>1)-2,300-this_imaginary_value-((t_coordinate-160)>>2)+2);
      g.drawLine(160-this_real_value+((t_coordinate-160)>>1)-2,300-this_imaginary_value-((t_coordinate-160)>>2)+2,160-this_real_value+((t_coordinate-160)>>1)-2,300-this_imaginary_value-((t_coordinate-160)>>2)-2);
      }

    } // end paint()

  } // end board3DClass       


//




class allControlsClass extends Panel
  {
  realVsTimeClass                        realVsTime;
  timeVsNegRealClass                 timeVsNegRealClass;
  imaginaryVsNegRealClass       imaginaryVsNegReal;
  imaginaryVsTimeClass             imaginaryVsTime;
  amplitudeSigmaOmegaClass   amplitudeSigmaOmega;
  timeResetDemoClass                timeResetDemo;
  VTourn08 topParent;

  allControlsClass(VTourn08 topParentPassing)
    {
    topParent = topParentPassing;
    
    setLayout(new GridLayout(6,1,1,1));
    realVsTime             = new realVsTimeClass             (topParentPassing);
    timeVsNegRealClass     = new timeVsNegRealClass          (topParentPassing);
    imaginaryVsNegReal     = new imaginaryVsNegRealClass     (topParentPassing);
    imaginaryVsTime        = new imaginaryVsTimeClass        (topParentPassing);
    amplitudeSigmaOmega    = new amplitudeSigmaOmegaClass    (topParentPassing);
    timeResetDemo          = new timeResetDemoClass          (topParentPassing);
    add (realVsTime                          );
    add (timeVsNegRealClass        );
    add (imaginaryVsNegReal         );
    add (imaginaryVsTime               );
    add (amplitudeSigmaOmega     );
    add (timeResetDemo                  );
    realVsTime.setBackground(Color.black);
    timeVsNegRealClass.setBackground(Color.black);
    imaginaryVsNegReal.setBackground(Color.black);
    imaginaryVsTime.setBackground(Color.black);
    } // end of allControlsClass() function

  public Insets insets()
    {
    return new Insets(1,1,1,1);
    }

  public void paint(Graphics g)
    {
    realVsTime.repaint();
    timeVsNegRealClass.repaint();
    imaginaryVsNegReal.repaint();
    imaginaryVsTime.repaint();
    amplitudeSigmaOmega.repaint();
    timeResetDemo.repaint();
//    System.out.println("topParent.real_value_int_array[0] = " + topParent.real_value_int_array[0]);

    } // end paint()

  } // end of class allControlsClass




class   realVsTimeClass                        extends Panel
  {

  VTourn08 topParent;


  realVsTimeClass                        (VTourn08 topParentPassing)
    {
    this.topParent= topParentPassing;
    }

  public void paint(Graphics g)
    {
    int t_coordinate;
    int last_real_value= topParent.real_value_int_array[0];
    int this_real_value;
    // time axis
    g.setColor(Color.darkGray);
    g.drawLine(110, 50, 310,  50);
    g.drawLine(310, 50, 275,  47);
    g.drawLine(275, 47, 275,  53);
    g.drawLine(275, 53, 310,  50);
    // real axis
    g.setColor(new Color(128,32,32));
    g.drawLine(160, 60, 160,  5 );
    g.drawLine(160, 5 , 163,  20);
    g.drawLine(163, 20, 157,  20);
    g.drawLine(157, 20, 160,  5 );
    g.setColor(Color.lightGray);

    if ((topParent.omegaValeurNow>=-1600) && (topParent.omegaValeurNow<=1600))
      {
      for (t_coordinate= 1; t_coordinate < 320; t_coordinate ++)
        {
        this_real_value = topParent.real_value_int_array[t_coordinate];
        g.drawLine(t_coordinate-1,50-last_real_value,t_coordinate,50-this_real_value);
        last_real_value = this_real_value ;
        }
      }
    // draw the present time:
    g.setColor(Color.white);
    t_coordinate=topParent.timeValeurNow+160;
    if ((t_coordinate >= 0) && (t_coordinate < 320))
      {
      this_real_value = topParent.real_value_int_array[t_coordinate];
      g.drawLine(t_coordinate-2,50-this_real_value-2,t_coordinate+2,50-this_real_value-2);
      g.drawLine(t_coordinate+2,50-this_real_value-2,t_coordinate+2,50-this_real_value+2);
      g.drawLine(t_coordinate+2,50-this_real_value+2,t_coordinate-2,50-this_real_value+2);
      g.drawLine(t_coordinate-2,50-this_real_value+2,t_coordinate-2,50-this_real_value-2);
      }

    } // end paint()

  } // end realVsTimeClass                        

class   timeVsNegRealClass                 extends Panel
  {

  VTourn08 topParent;

  timeVsNegRealClass                 (VTourn08 topParentPassing)
    {
    this.topParent= topParentPassing;    
    }

  public void paint(Graphics g)
    {
    int t_coordinate;
    int last_real_value= topParent.real_value_int_array[110];
    int this_real_value;
    // real axis
    g.setColor(new Color(128,32,32));
    g.drawLine(170, 50, 115,  50);
    g.drawLine(115, 50, 130,  53);
    g.drawLine(130, 53, 130,  47);
    g.drawLine(130, 47, 115,  50);
    // time axis
    g.setColor(Color.darkGray);
    g.drawLine(160, 60, 160,  5 );
    g.drawLine(160, 5 , 163,  20);
    g.drawLine(163, 20, 157,  20);
    g.drawLine(157, 20, 160,  5 );
    g.setColor(Color.lightGray);

    if ((topParent.omegaValeurNow>=-1600) && (topParent.omegaValeurNow<=1600))
      {
      for (t_coordinate= 111; t_coordinate < 210; t_coordinate ++)
        {
        this_real_value = topParent.real_value_int_array[t_coordinate];
        g.drawLine(160-last_real_value,211-t_coordinate,160-this_real_value,210-t_coordinate);
        last_real_value = this_real_value ;
        }
      }
    // draw the present time:
    g.setColor(Color.white);
    t_coordinate=topParent.timeValeurNow+160;
    if ((t_coordinate >= 100) && (t_coordinate < 210))
      {
      this_real_value = topParent.real_value_int_array[t_coordinate];
      g.drawLine(160-this_real_value-2,210-t_coordinate-2,160-this_real_value+2,210-t_coordinate-2);
      g.drawLine(160-this_real_value+2,210-t_coordinate-2,160-this_real_value+2,210-t_coordinate+2);
      g.drawLine(160-this_real_value+2,210-t_coordinate+2,160-this_real_value-2,210-t_coordinate+2);
      g.drawLine(160-this_real_value-2,210-t_coordinate+2,160-this_real_value-2,210-t_coordinate-2);

      }

    } // end paint()

  } // end timeVsNegRealClass                 

class   imaginaryVsNegRealClass       extends Panel
  {

  VTourn08 topParent;

  imaginaryVsNegRealClass       (VTourn08 topParentPassing)
    {
    this.topParent= topParentPassing;
    }

  public void paint(Graphics g)
    {
    int t_coordinate;
    int last_real_value= topParent.real_value_int_array[0];
    int last_imaginary_value= topParent.imaginary_value_int_array[0];
    int this_real_value=0;
    int this_imaginary_value=0;

    // real axis
    g.setColor(new Color(128,32,32));
    g.drawLine(170, 50, 115,  50);
    g.drawLine(115, 50, 130,  53);
    g.drawLine(130, 53, 130,  47);
    g.drawLine(130, 47, 115,  50);
    // imaginary axis
    g.setColor(new Color(32,128,32));
    g.drawLine(160, 60, 160,  5 );
    g.drawLine(160, 5 , 163,  20);
    g.drawLine(163, 20, 157,  20);
    g.drawLine(157, 20, 160,  5 );
    g.setColor(Color.lightGray);

    if ((topParent.omegaValeurNow>=-1600) && (topParent.omegaValeurNow<=1600))
      {
      for (t_coordinate= 1; t_coordinate < 320; t_coordinate ++)
        {
        this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
        this_real_value = topParent.real_value_int_array[t_coordinate];
        g.drawLine(160-last_real_value,50-last_imaginary_value,160-this_real_value,50-this_imaginary_value);
        last_imaginary_value = this_imaginary_value ;
        last_real_value = this_real_value ;
        }
      }
    // draw the present time:
    g.setColor(Color.white);
    t_coordinate=topParent.timeValeurNow+160;
    if ((t_coordinate >= 0) && (t_coordinate < 320))
      {
      this_real_value = topParent.real_value_int_array[t_coordinate];
      this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
      g.drawLine(160-this_real_value-2,50-this_imaginary_value-2,160-this_real_value+2,50-this_imaginary_value-2);
      g.drawLine(160-this_real_value+2,50-this_imaginary_value-2,160-this_real_value+2,50-this_imaginary_value+2);
      g.drawLine(160-this_real_value+2,50-this_imaginary_value+2,160-this_real_value-2,50-this_imaginary_value+2);
      g.drawLine(160-this_real_value-2,50-this_imaginary_value+2,160-this_real_value-2,50-this_imaginary_value-2);
      }

    } // end paint()

  } // end imaginaryVsNegRealClass       

class   imaginaryVsTimeClass             extends Panel
  {

  VTourn08 topParent;

  imaginaryVsTimeClass             (VTourn08 topParentPassing)
    {
    this.topParent= topParentPassing;
    }

  public void paint(Graphics g)
    {
    int t_coordinate;
    int last_imaginary_value= topParent.imaginary_value_int_array[0];
    int this_imaginary_value;

    // time axis
    g.setColor(Color.darkGray);
    g.drawLine(110, 50, 310,  50);
    g.drawLine(310, 50, 275,  47);
    g.drawLine(275, 47, 275,  53);
    g.drawLine(275, 53, 310,  50);
    // imaginary axis
    g.setColor(new Color(32,128,32));
    g.drawLine(160, 60, 160,  5 );
    g.drawLine(160, 5 , 163,  20);
    g.drawLine(163, 20, 157,  20);
    g.drawLine(157, 20, 160,  5 );
    g.setColor(Color.lightGray);
    if ((topParent.omegaValeurNow>=-1600) && (topParent.omegaValeurNow<=1600))
      {
      for (t_coordinate= 1;t_coordinate < 320; t_coordinate ++)
        {
        this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
        g.drawLine(t_coordinate-1,50-last_imaginary_value,t_coordinate,50-this_imaginary_value);
        last_imaginary_value = this_imaginary_value ;
        }
      }
    // draw the present time:
    g.setColor(Color.white);
    t_coordinate=topParent.timeValeurNow+160;
    if ((t_coordinate >= 0) && (t_coordinate < 320))
      {
      this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
      g.drawLine(t_coordinate-2,50-this_imaginary_value-2,t_coordinate+2,50-this_imaginary_value-2);
      g.drawLine(t_coordinate+2,50-this_imaginary_value-2,t_coordinate+2,50-this_imaginary_value+2);
      g.drawLine(t_coordinate+2,50-this_imaginary_value+2,t_coordinate-2,50-this_imaginary_value+2);
      g.drawLine(t_coordinate-2,50-this_imaginary_value+2,t_coordinate-2,50-this_imaginary_value-2);

      }

    } // end paint()

  } // end imaginaryVsTimeClass             

class   amplitudeSigmaOmegaClass   extends Panel
  {

  final double eight_on_ten_PI = 0.2546479089 ;
  final double ten_PI_on_eight = 3.926990817 ;

  String amplitudeValeurButtonString    = "10^ (0)";
  Button amplitudeValeurButton;
  String amplitudeAnimationButtonString = "10^ (0)/s";
  Button amplitudeAnimationButton;
  String sigmaValeurButtonString        = "0";
  Button sigmaValeurButton;
  String sigmaAnimationButtonString     = "0/s";
  Button sigmaAnimationButton;
  String omegaValeurLessButtonString    = "< PI/80 rad/s";
  Button omegaValeurLessButton;
  String omegaValeurMoreButtonString    = "PI/80 rad/s >";
  Button omegaValeurMoreButton;
  String omegaAnimationLessButtonString = "<< PI/80 rad/s2";
  Button omegaAnimationLessButton;
  String omegaAnimationMoreButtonString = "PI/80 rad/s2 >>";
  Button omegaAnimationMoreButton;
  String omegaUnitesCheckboxString      = "calcule en PI";
  Checkbox omegaUnitesCheckbox;
  String omegaValeurButtonString        = "0 PI/80 rad/s";
  Button omegaValeurButton;
  String omegaAnimationButtonString     = "0 PI/80 rad/s2";
  Button omegaAnimationButton;
  VTourn08 topParent;

  amplitudeSigmaOmegaClass   (VTourn08 topParentPassing)
    {
    this.topParent= topParentPassing;
    setLayout(new GridLayout(6,4,2,1));
    add (new Label("amplitude"));
    amplitudeValeurButton = new Button (amplitudeValeurButtonString);
    add (amplitudeValeurButton);
    add( new Button("<"));
    add( new Button(">"));
    add (new Label(""));
    amplitudeAnimationButton = new Button (amplitudeAnimationButtonString);
    add (amplitudeAnimationButton);
    add( new Button("<<"));
    add( new Button(">>"));
    add (new Label("sigma"));
    sigmaValeurButton = new Button (sigmaValeurButtonString);
    add (sigmaValeurButton);
    add( new Button(" < "));
    add( new Button(" > "));
    add (new Label(""));
    sigmaAnimationButton = new Button (sigmaAnimationButtonString);
    add (sigmaAnimationButton);
    add( new Button(" << "));
    add( new Button(" >> "));
    add (new Label("Omega"));
    omegaValeurButton = new Button (omegaValeurButtonString);
    add (omegaValeurButton);
    omegaValeurLessButton = new Button (omegaValeurLessButtonString);
    add (omegaValeurLessButton);
    omegaValeurMoreButton = new Button (omegaValeurMoreButtonString);
    add (omegaValeurMoreButton);
    omegaUnitesCheckbox = new Checkbox(omegaUnitesCheckboxString,null,true);
    add (omegaUnitesCheckbox);
    omegaAnimationButton = new Button (omegaAnimationButtonString);
    add (omegaAnimationButton);
    omegaAnimationLessButton= new Button(omegaAnimationLessButtonString);
    add (omegaAnimationLessButton);
    omegaAnimationMoreButton= new Button(omegaAnimationMoreButtonString);
    add (omegaAnimationMoreButton);
    }
  public boolean action(Event evt, Object arg)
    {
    if (evt.target instanceof Checkbox)
      {
      if (omegaUnitesCheckbox.getState() == true)
//        if (topParent.omegaUnitesIsInPI==false)
          {
          topParent.omegaUnitesIsInPI=true;
          convertToPI();
          }
      else
//        if (topParent.omegaUnitesIsInPI==true)
          {
          topParent.omegaUnitesIsInPI=false;
          convertFromPI();
          }
      }
    else if (evt.target instanceof Button)
      {
      if (arg ==      amplitudeValeurButtonString) topParent.amplitudeLogValeurNow=0;
      else if (arg == amplitudeAnimationButtonString) topParent.amplitudeLogAnimationNow=0;
      else if (arg ==   "<"    ) topParent.amplitudeLogValeurNow-=1;
      else if (arg ==   ">"    ) topParent.amplitudeLogValeurNow+=1;
      else if (arg ==   "<<"   ) topParent.amplitudeLogAnimationNow-=1;
      else if (arg ==   ">>"   ) topParent.amplitudeLogAnimationNow+=1;
      else if (arg == sigmaValeurButtonString) topParent.sigmaValeurNow=0;
      else if (arg == sigmaAnimationButtonString) topParent.sigmaAnimationNow=0;
      else if (arg ==  " < "   ) topParent.sigmaValeurNow-=1;
      else if (arg ==  " > "   ) topParent.sigmaValeurNow+=1;
      else if (arg ==  " << "  ) topParent.sigmaAnimationNow-=1;
      else if (arg ==  " >> "  ) topParent.sigmaAnimationNow+=1;
      else if (arg == omegaValeurButtonString) topParent.omegaValeurNow=0;
      else if (arg == omegaAnimationButtonString) topParent.omegaAnimationNow=0;
      else if (arg == omegaValeurLessButtonString) topParent.omegaValeurNow-=10;
      else if (arg == omegaValeurMoreButtonString) topParent.omegaValeurNow+=10;
      else if (arg == omegaAnimationLessButtonString) topParent.omegaAnimationNow-=1;
      else if (arg == omegaAnimationMoreButtonString) topParent.omegaAnimationNow+=1;
      } //end of if (evt.target instanceof Button)
    redrawLabels();
    return true;
    } // end of public boolean action(Event evt, Object arg)


  void convertToPI()
    {
    omegaValeurLessButtonString    = "< PI/80 rad/s";
    omegaValeurLessButton.setLabel(omegaValeurLessButtonString);
    omegaValeurMoreButtonString    = "PI/80 rad/s >";
    omegaValeurMoreButton.setLabel(omegaValeurMoreButtonString);
    omegaAnimationLessButtonString = "<< PI/80 rad/s2";
    omegaAnimationLessButton.setLabel(omegaAnimationLessButtonString);
    omegaAnimationMoreButtonString = "PI/80 rad/s2 >>";
    omegaAnimationMoreButton.setLabel(omegaAnimationMoreButtonString);
    topParent.omegaValeurNow=(int)(topParent.omegaValeurNow*eight_on_ten_PI);
    topParent.omegaAnimationNow=(int)(topParent.omegaAnimationNow*eight_on_ten_PI);
    }

  void convertFromPI()
    {
    omegaValeurLessButtonString    = "< rad/s";
    omegaValeurLessButton.setLabel(omegaValeurLessButtonString);
    omegaValeurMoreButtonString    = "rad/s >";
    omegaValeurMoreButton.setLabel(omegaValeurMoreButtonString);
    omegaAnimationLessButtonString = "<< rad/s2";
    omegaAnimationLessButton.setLabel(omegaAnimationLessButtonString);
    omegaAnimationMoreButtonString = "rad/s2 >>";
    omegaAnimationMoreButton.setLabel(omegaAnimationMoreButtonString);
    topParent.omegaValeurNow=(int)(topParent.omegaValeurNow*ten_PI_on_eight);
    topParent.omegaAnimationNow=(int)(topParent.omegaAnimationNow*ten_PI_on_eight);
    }


  public void redrawLabels()
    {
    amplitudeValeurButtonString ="10^ ("+String.valueOf(topParent.amplitudeLogValeurNow*0.1)+")";
    amplitudeValeurButton.setLabel(amplitudeValeurButtonString);
    amplitudeAnimationButtonString="10^ ("+String.valueOf(topParent.amplitudeLogAnimationNow*0.1)+")/ref";
    amplitudeAnimationButton.setLabel(amplitudeAnimationButtonString);
    sigmaValeurButtonString=String.valueOf(topParent.sigmaValeurNow*0.01);
    sigmaValeurButton.setLabel(sigmaValeurButtonString);
    sigmaAnimationButtonString=String.valueOf(topParent.sigmaAnimationNow*0.01)+"/ref";
    sigmaAnimationButton.setLabel(sigmaAnimationButtonString);
    if (topParent.omegaUnitesIsInPI)
      {
      omegaValeurButtonString=String.valueOf(topParent.omegaValeurNow)+"PI/80 rad/s";
      omegaAnimationButtonString=String.valueOf(topParent.omegaAnimationNow)+"PI/80 rad/s/ref";
      }
    else
      {
      omegaValeurButtonString=String.valueOf(topParent.omegaValeurNow*0.1)+"rad/s";
      omegaAnimationButtonString=String.valueOf(topParent.omegaAnimationNow*0.1)+"rad/s/ref";
      }
    omegaValeurButton.setLabel(omegaValeurButtonString);
    omegaAnimationButton.setLabel(omegaAnimationButtonString);
    }
  public void paint(Graphics g)
    {
    redrawLabels();
    } // end paint()
  } // end amplitudeSigmaOmegaClass





class   timeResetDemoClass                extends Panel
  {
  String timeValeurButtonString = "0sec";
  Button timeValeurButton;
  String timeAnimationButtonString ="0sec/refresh";
  Button timeAnimationButton;
  Label refreshTimeValeurLabel;
  VTourn08 topParent;

  timeResetDemoClass                (VTourn08 topParentPassing)
    {
    this.topParent= topParentPassing;
    setLayout(new GridLayout(6,4,2,1));
    add (new Label("time"));
    timeValeurButton = new Button( timeValeurButtonString);
    add (timeValeurButton);
    add( new Button("<"));
    add( new Button(">"));
    add (new Label(""));
    timeAnimationButton = new Button(timeAnimationButtonString);
    add (timeAnimationButton);
    add( new Button("<<"));
    add( new Button(">>"));
    add( new Label(""));
    add( new Label(""));
    add( new Label(""));
    add( new Label(""));
    add( new Label("refresh"));
    refreshTimeValeurLabel = new Label ("5.0 sec");
    add( refreshTimeValeurLabel);
    add( new Button(" < "));
    add( new Button(" > "));
    add( new Label(""));
    add( new Label(""));
    add( new Label(""));
    add( new Label(""));
    add( new Label(""));
    add( new Button("reset all"));
    add( new Button("demo"));
    add( new Label(""));
    }
  public boolean action(Event evt, Object arg)
    {
    if (evt.target instanceof Button)
      {
      if (arg == timeValeurButtonString) topParent.timeValeurNow=0;
      if (arg == timeAnimationButtonString) topParent.timeAnimationNow=0;
      else if (arg ==   "<"    ) topParent.timeValeurNow-=1;
      else if (arg ==   ">"    ) topParent.timeValeurNow+=1;
      else if (arg ==   "<<"   ) topParent.timeAnimationNow-=1;
      else if (arg ==   ">>"   ) topParent.timeAnimationNow+=1;
      else if (arg ==  " < "   )
        {
        if (topParent.refreshTimeValeurNow > 1000) topParent.refreshTimeValeurNow -=250;
        else if (topParent.refreshTimeValeurNow > 300) topParent.refreshTimeValeurNow -=100;
        else topParent.refreshTimeValeurNow -=25;
        }
      else if (arg ==  " > "   )
        {
        if (topParent.refreshTimeValeurNow > 500) topParent.refreshTimeValeurNow +=500;
        else if (topParent.refreshTimeValeurNow > 100) topParent.refreshTimeValeurNow +=100;
        else topParent.refreshTimeValeurNow +=25;
        }
      } //end of if (evt.target instanceof Button)
    redrawLabels();
    return true;
    } // end of public boolean action(Event evt, Object arg)

  public void redrawLabels()
    {
    timeValeurButtonString =String.valueOf(topParent.timeValeurNow*0.1 + "sec");
    timeValeurButton.setLabel(timeValeurButtonString);
    timeAnimationButtonString =String.valueOf(topParent.timeAnimationNow*0.1 + "sec/refresh") ;
    timeAnimationButton.setLabel(timeAnimationButtonString);
    refreshTimeValeurLabel.setText(String.valueOf(topParent.refreshTimeValeurNow*0.001)+" sec");
    }

  public void paint(Graphics g)
    {
    redrawLabels();
    } // end paint()
  } // end timeResetDemoClass                



