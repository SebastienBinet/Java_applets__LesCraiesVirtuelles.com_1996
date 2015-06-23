// note: cette version s'auto-refresh lorsque necessaire.




import java.awt.*;

public class ExponComplexFr207 extends java.applet.Applet
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
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0};
  static int imaginary_value_int_array[] = {
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
  0};
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

  boolean blackBoardNeedsToBeRedrawn=false;

  blackBoardClass blackBoard;
  allControlsClass rightZone;

  int amplitudeValeurNow = 10;
  int sigmaValeurNow = 0;
  int sigmaAnimationNow = 0;
  int omegaValeurNow = 80;
  int omegaAnimationNow = 0;
  int timeValeurNow = 0;
  int timeAnimationNow = 0;

  int zoom=0;  //valeurs possibles: 0(1<<0=1),1(1<<1=2),2(1<<2=4)

  boolean showProjRI=false; // sert a afficher ou non cette projection
  boolean showProjRT=false; // sert a afficher ou non cette projection
  boolean showProjIT=false; // sert a afficher ou non cette projection

  int refreshTimeValeurNow=1500;

  boolean omegaUnitesIsInPI = true;

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
      amplitude_a_t_egal_0 = 0.1 * amplitudeValeurNow;
      pas_en_t = omegaValeurNow;
      indice_actuel=(-160*pas_en_t);
      while (indice_actuel >= 1600 ) indice_actuel -= 1600;
      while (indice_actuel < 0 ) indice_actuel += 1600;
      //System.out.println("indice_actuel = " + indice_actuel);

      sigmaValeurNow+=sigmaAnimationNow;
      omegaValeurNow+=omegaAnimationNow;

      timeValeurNow+=timeAnimationNow;
      if ((pas_en_t >160 ) || (pas_en_t <-160 ))
      // data has now no signification !
      ;
      //   for(x_coordinate = 0 ; x_coordinate < 320; x_coordinate++)
      //    {
      //    g.drawLine(x_coordinate, (50+20  amplitude_a_t_egal_0  ),x_coordinate, (50-20));
      //    }
      else
        for (t_coordinate = 0; t_coordinate <= 320; t_coordinate++)
          {
          while (indice_actuel >=  1600 ) indice_actuel -= 1600;
          while (indice_actuel < 0 ) indice_actuel += 1600;
          real_value_int_array[t_coordinate] = (int)(e_a_n_millieme(sigmaValeurNow*(t_coordinate-160)) *80 *amplitude_a_t_egal_0 * Sin_in_PI[(int)(indice_actuel*0.1)+40]);
          imaginary_value_int_array[t_coordinate] = (int)(e_a_n_millieme(sigmaValeurNow*(t_coordinate-160)) * 80* amplitude_a_t_egal_0 * Sin_in_PI[(int)(indice_actuel*0.1)]);
          if (real_value_int_array[t_coordinate] > 32767) real_value_int_array[t_coordinate] = 32767;
          if (real_value_int_array[t_coordinate] < -32767) real_value_int_array[t_coordinate] = -32767;
          if (imaginary_value_int_array[t_coordinate] > 32767) imaginary_value_int_array[t_coordinate] = 32767;
          if (imaginary_value_int_array[t_coordinate] < -32767) imaginary_value_int_array[t_coordinate] = -32767;
          indice_actuel += pas_en_t;
          }
      if (blackBoardNeedsToBeRedrawn)
        {
        blackBoardNeedsToBeRedrawn = false;
        repaint();
        }
      } // end while (true)
    } // end public void run()

  public void init()
    {
     setLayout(new GridLayout(1,2,2,2));
     rightZone = new allControlsClass(this);
     rightZone.setBackground(Color.lightGray);
     blackBoard = new blackBoardClass(this);
     blackBoard.setBackground(Color.lightGray);
     add(blackBoard);
     add(rightZone);
    } // end of function init() of class VTourn??

  public Insets insets()
    {
    return new Insets(6,6,6,6);
    }

  public void update(Graphics g)
    {
    paint(g);
    }

  public void paint(Graphics g)
    {
    blackBoard.repaint();
    rightZone.repaint();

    // GUI border:
    // GUI border of applet
    g.setColor(Color.white);
    g.drawLine(0,0,774,0);
    g.drawLine(0,0,0,524);
    g.drawLine(1,1,773,1);
    g.drawLine(1,1,1,523);
    g.setColor(Color.black);
    g.drawLine(774,0,774,524);
    g.drawLine(0,524,774,524);
    g.drawLine(773,1,773,523);
    g.drawLine(1,523,773,523);



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
class   blackBoardClass       extends Panel
  {
  ExponComplexFr207 topParent;

  blackBoardOne3DClass blackBoardOne3D;
  blackBoardThree2DClass blackBoardOne3D2;

  blackBoardClass (ExponComplexFr207 topParentPassing)
    {
    this.topParent= topParentPassing;
    setLayout(new GridLayout(2,1,0,6));

    blackBoardOne3D = new blackBoardOne3DClass(topParent);
    blackBoardOne3D.setBackground(Color.black);
    add(blackBoardOne3D);

    blackBoardOne3D2 = new blackBoardThree2DClass(topParent);
    blackBoardOne3D2.setBackground(Color.black);
    add(blackBoardOne3D2);
    }

  public Insets insets()
    {
    return new Insets(2,2,2,2);
    }

  public void update(Graphics g)
    {
    paint(g);
    }

  public void paint(Graphics g)
    {
    // GUI borders of blackBoards
    g.setColor(Color.gray);
    g.drawLine(1,1,1,253);
    g.drawLine(1,1,378,1);
    g.setColor(Color.white);
    g.drawLine(1,253,378,253);
    g.drawLine(378,1,378,253);

    g.setColor(Color.gray);
    g.drawLine(1,258,1,510);
    g.drawLine(1,258,378,258);
    g.setColor(Color.white);
    g.drawLine(1,510,378,510);
    g.drawLine(378,258,378,510);
      
    blackBoardOne3D.repaint();
    blackBoardOne3D2.repaint();
    } // end paint()

  } // end blackBoardClass



class blackBoardOne3DClass extends Panel
  {
  final int panel_width = 100;
  final int panel_height = 100;
  final int X_PIXEL_POS_A = 160;
  final int Y_PIXEL_POS_A = 150;
  ExponComplexFr207 topParent;


  blackBoardOne3DClass       (ExponComplexFr207 topParentPassing)
    {
    this.topParent= topParentPassing;
    }

  public Insets insets()
    {
    return new Insets(2,2,2,2);
    }


  public void paint(Graphics g)
    {
    int t_coordinate;
    int last_real_value;
    int last_imaginary_value;
    int this_real_value=0;
    int this_imaginary_value=0;

    // real axis
    g.setColor(new Color(128,32,32));
    g.drawLine(X_PIXEL_POS_A+10,Y_PIXEL_POS_A, X_PIXEL_POS_A-45, Y_PIXEL_POS_A);
    g.drawLine(X_PIXEL_POS_A-45,Y_PIXEL_POS_A, X_PIXEL_POS_A-30, Y_PIXEL_POS_A+3);
    g.drawLine(X_PIXEL_POS_A-30,Y_PIXEL_POS_A+3, X_PIXEL_POS_A-30, Y_PIXEL_POS_A-3);
    g.drawLine(X_PIXEL_POS_A-30,Y_PIXEL_POS_A-3, X_PIXEL_POS_A-45, Y_PIXEL_POS_A);
    // imaginary axis
    g.setColor(new Color(32,128,32));
    g.drawLine(X_PIXEL_POS_A,Y_PIXEL_POS_A+10, X_PIXEL_POS_A, Y_PIXEL_POS_A-45);
    g.drawLine(X_PIXEL_POS_A,Y_PIXEL_POS_A-45, X_PIXEL_POS_A+3, Y_PIXEL_POS_A-30);
    g.drawLine(X_PIXEL_POS_A+3,Y_PIXEL_POS_A-30, X_PIXEL_POS_A-3, Y_PIXEL_POS_A-30);
    g.drawLine(X_PIXEL_POS_A-3,Y_PIXEL_POS_A-30, X_PIXEL_POS_A, Y_PIXEL_POS_A-45);
    // time axis
    g.setColor(Color.gray);
    g.drawLine(X_PIXEL_POS_A-25,Y_PIXEL_POS_A+13,X_PIXEL_POS_A+76,Y_PIXEL_POS_A-38);
    g.drawLine(X_PIXEL_POS_A+76,Y_PIXEL_POS_A-38,X_PIXEL_POS_A+41,Y_PIXEL_POS_A-17);
    g.drawLine(X_PIXEL_POS_A+41,Y_PIXEL_POS_A-17,X_PIXEL_POS_A+41,Y_PIXEL_POS_A-24);
    g.drawLine(X_PIXEL_POS_A+41,Y_PIXEL_POS_A-24,X_PIXEL_POS_A+76,Y_PIXEL_POS_A-38);

    // draw complexe exponential
    if ((topParent.omegaValeurNow>=-1600) && (topParent.omegaValeurNow<=1600))
      {
      last_real_value= ((topParent.real_value_int_array[0])>>2);
      last_imaginary_value= ((topParent.imaginary_value_int_array[0])>>2);
      g.setColor(Color.gray);
      for (t_coordinate= 1; t_coordinate <= 320; t_coordinate ++)
        {
        this_imaginary_value = ((topParent.imaginary_value_int_array[t_coordinate])>>2);
        this_real_value = ((topParent.real_value_int_array[t_coordinate])>>2);
        g.drawLine(X_PIXEL_POS_A-last_real_value+(t_coordinate-1-160),Y_PIXEL_POS_A-last_imaginary_value-((t_coordinate-1-160)>>1),X_PIXEL_POS_A-this_real_value+(t_coordinate-160),Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1));
        last_imaginary_value = this_imaginary_value ;
        last_real_value = this_real_value ;
        }
      last_real_value= ((topParent.real_value_int_array[150])>>2);
      last_imaginary_value= ((topParent.imaginary_value_int_array[150])>>2);
      g.setColor(Color.lightGray);
      for (t_coordinate= 151; t_coordinate <= 170; t_coordinate ++)
        {
        this_imaginary_value = ((topParent.imaginary_value_int_array[t_coordinate])>>2);
        this_real_value = ((topParent.real_value_int_array[t_coordinate])>>2);
        g.drawLine(X_PIXEL_POS_A-last_real_value+(t_coordinate-1-160),Y_PIXEL_POS_A-last_imaginary_value-((t_coordinate-1-160)>>1),X_PIXEL_POS_A-this_real_value+(t_coordinate-160),Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1));
        last_imaginary_value = this_imaginary_value ;
        last_real_value = this_real_value ;
        }
      }
    // draw the present time:
    g.setColor(Color.white);
    t_coordinate=topParent.timeValeurNow+160;
    if ((t_coordinate >= 0) && (t_coordinate <= 320))
      {
      this_real_value = ((topParent.real_value_int_array[t_coordinate])>>2);
      this_imaginary_value = ((topParent.imaginary_value_int_array[t_coordinate])>>2);
      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2);
      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2);
      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2);
      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2);
      }
    } // end paint()

  } // end blackBoardOne3DClass       


class blackBoardThree2DClass extends Panel
  {
  final int X_PIXEL_POS_A = 160;
  final int Y_PIXEL_POS_A = 150;
  final int X_PIXEL_POS_B = 160;
  final int Y_PIXEL_POS_B = 150;
  ExponComplexFr207 topParent;


  blackBoardThree2DClass       (ExponComplexFr207 topParentPassing)
    {
    this.topParent= topParentPassing;
    }

  public Insets insets()
    {
    return new Insets(2,2,2,2);
    }

  public void paint(Graphics g)
    {
    int t_coordinate;
    int last_real_value;
    int last_imaginary_value;
    int this_real_value=0;
    int this_imaginary_value=0;

    int zoom=this.topParent.zoom;
    int t=5, i=20, r=20;
    int xA=X_PIXEL_POS_B+((-t-t+r)<<zoom), yA=Y_PIXEL_POS_B+((+t-i)<<zoom);//        F-------E
    int xB=X_PIXEL_POS_B+((-t-t-r)<<zoom), yB=Y_PIXEL_POS_B+((+t-i)<<zoom);//       /|      /|
    int xC=X_PIXEL_POS_B+((-t-t+r)<<zoom), yC=Y_PIXEL_POS_B+((+t+i)<<zoom);//      B-------A |
    int xD=X_PIXEL_POS_B+((-t-t-r)<<zoom), yD=Y_PIXEL_POS_B+((+t+i)<<zoom);//      | |     | |
    int xE=X_PIXEL_POS_B+((+t+t+r)<<zoom), yE=Y_PIXEL_POS_B+((-t-i)<<zoom);//      | H-----|-G
    int xF=X_PIXEL_POS_B+((+t+t-r)<<zoom), yF=Y_PIXEL_POS_B+((-t-i)<<zoom);//      |/      |/
    int xG=X_PIXEL_POS_B+((+t+t+r)<<zoom), yG=Y_PIXEL_POS_B+((-t+i)<<zoom);//      D-------C
    int xH=X_PIXEL_POS_B+((+t+t-r)<<zoom), yH=Y_PIXEL_POS_B+((-t+i)<<zoom);//
    
    
    // cube:
    g.setColor(Color.gray);
    g.drawLine(xD,yD,xH,yH);
    g.drawLine(xH,yH,xF,yF);
    g.drawLine(xH,yH,xG,yG);
    g.setColor(Color.gray);
    g.drawLine(xB,yB,xA,yA);
    g.drawLine(xA,yA,xE,yE);
    g.drawLine(xA,yA,xC,yC);
    g.drawLine(xC,yC,xD,yD);
    g.drawLine(xD,yD,xB,yB);
    g.drawLine(xB,yB,xF,yF);
    g.drawLine(xC,yC,xG,yG);
    g.drawLine(xG,yG,xE,yE);
    g.drawLine(xE,yE,xF,yF);

    if ((topParent.omegaValeurNow>=-1600) && (topParent.omegaValeurNow<=1600))
      {
      last_real_value= ((topParent.real_value_int_array[150])>>(2-zoom));
      last_imaginary_value= ((topParent.imaginary_value_int_array[150])>>(2-zoom));
      g.setColor(Color.gray);
      for (t_coordinate= 151; t_coordinate <= 170; t_coordinate ++)
        {
        this_imaginary_value = ((topParent.imaginary_value_int_array[t_coordinate])>>(2-zoom));
        this_real_value = ((topParent.real_value_int_array[t_coordinate])>>(2-zoom));

        // 3D
        g.setColor(Color.lightGray);
        g.drawLine(X_PIXEL_POS_A-last_real_value+(((t_coordinate-1-160))<<zoom),Y_PIXEL_POS_A-last_imaginary_value-((((t_coordinate-1-160)<<zoom))>>1),X_PIXEL_POS_A-this_real_value+(((t_coordinate-160))<<zoom),Y_PIXEL_POS_A-this_imaginary_value-((((t_coordinate-160)<<zoom))>>1));
        // plane Real vs Imaginary:
        if (topParent.showProjRI)
          {
          g.setColor(Color.gray);
          g.drawLine(X_PIXEL_POS_A-last_real_value-((10)<<zoom),Y_PIXEL_POS_A-last_imaginary_value+((5)<<zoom),X_PIXEL_POS_A-this_real_value-((10)<<zoom),Y_PIXEL_POS_A-this_imaginary_value+((5)<<zoom));
          }
        // plane Imaginary vs Time
        if (topParent.showProjIT)
          {
          g.setColor(new Color(128,32,32));
          g.drawLine(X_PIXEL_POS_A+((20+(t_coordinate-1-160))<<zoom),Y_PIXEL_POS_A-last_imaginary_value-((((t_coordinate-1-160)<<zoom))>>1),X_PIXEL_POS_A+((20+(t_coordinate-160))<<zoom),Y_PIXEL_POS_A-this_imaginary_value-((((t_coordinate-160)<<zoom))>>1));
          }
        // plane Real vs Time
        if (topParent.showProjRT)
          {
          g.setColor(new Color(32,128,32));
          g.drawLine(X_PIXEL_POS_A-last_real_value+(((t_coordinate-1-160))<<zoom),Y_PIXEL_POS_A+(-20<<zoom)-(((t_coordinate-1-160)<<zoom)>>1),X_PIXEL_POS_A-this_real_value+((t_coordinate-160)<<zoom),Y_PIXEL_POS_A+(-20<<zoom)-(((t_coordinate-160)<<zoom)>>1));
          }
        last_imaginary_value = this_imaginary_value ;
        last_real_value = this_real_value ;
        }
      last_real_value= ((topParent.real_value_int_array[150])>>(2-zoom));
      last_imaginary_value= ((topParent.imaginary_value_int_array[150])>>(2-zoom));
      }
//    // draw the present time:
//    g.setColor(Color.white);
//    t_coordinate=topParent.timeValeurNow+160;
//    if ((t_coordinate >= 0) && (t_coordinate <= 320))
//      {
//      this_real_value = topParent.real_value_int_array[t_coordinate];
//      this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
//      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2);
//      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2);
//      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2);
//      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2);
//      }



 if (false){
    // real axis
    g.setColor(new Color(128,32,32));
    g.drawLine(X_PIXEL_POS_A+10,Y_PIXEL_POS_A, X_PIXEL_POS_A-45, Y_PIXEL_POS_A);
    g.drawLine(X_PIXEL_POS_A-45,Y_PIXEL_POS_A, X_PIXEL_POS_A-30, Y_PIXEL_POS_A+3);
    g.drawLine(X_PIXEL_POS_A-30,Y_PIXEL_POS_A+3, X_PIXEL_POS_A-30, Y_PIXEL_POS_A-3);
    g.drawLine(X_PIXEL_POS_A-30,Y_PIXEL_POS_A-3, X_PIXEL_POS_A-45, Y_PIXEL_POS_A);
    // imaginary axis
    g.setColor(new Color(32,128,32));
    g.drawLine(X_PIXEL_POS_A,Y_PIXEL_POS_A+10, X_PIXEL_POS_A, Y_PIXEL_POS_A-45);
    g.drawLine(X_PIXEL_POS_A,Y_PIXEL_POS_A-45, X_PIXEL_POS_A+3, Y_PIXEL_POS_A-30);
    g.drawLine(X_PIXEL_POS_A+3,Y_PIXEL_POS_A-30, X_PIXEL_POS_A-3, Y_PIXEL_POS_A-30);
    g.drawLine(X_PIXEL_POS_A-3,Y_PIXEL_POS_A-30, X_PIXEL_POS_A, Y_PIXEL_POS_A-45);
    // time axis
    g.setColor(Color.gray);
    g.drawLine(X_PIXEL_POS_A-25,Y_PIXEL_POS_A+13,X_PIXEL_POS_A+76,Y_PIXEL_POS_A-38);
    g.drawLine(X_PIXEL_POS_A+76,Y_PIXEL_POS_A-38,X_PIXEL_POS_A+41,Y_PIXEL_POS_A-17);
    g.drawLine(X_PIXEL_POS_A+41,Y_PIXEL_POS_A-17,X_PIXEL_POS_A+41,Y_PIXEL_POS_A-24);
    g.drawLine(X_PIXEL_POS_A+41,Y_PIXEL_POS_A-24,X_PIXEL_POS_A+76,Y_PIXEL_POS_A-38);
    // draw complexe exponential

    if ((topParent.omegaValeurNow>=-1600) && (topParent.omegaValeurNow<=1600))
      {
      last_real_value= topParent.real_value_int_array[0];
      last_imaginary_value= topParent.imaginary_value_int_array[0];
      g.setColor(Color.gray);
      for (t_coordinate= 1; t_coordinate <= 320; t_coordinate ++)
        {
        this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
        this_real_value = topParent.real_value_int_array[t_coordinate];
        g.drawLine(X_PIXEL_POS_A-last_real_value+(t_coordinate-1-160),Y_PIXEL_POS_A-last_imaginary_value-((t_coordinate-1-160)>>1),X_PIXEL_POS_A-this_real_value+(t_coordinate-160),Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1));
        last_imaginary_value = this_imaginary_value ;
        last_real_value = this_real_value ;
        }
      last_real_value= topParent.real_value_int_array[150];
      last_imaginary_value= topParent.imaginary_value_int_array[150];
      g.setColor(Color.lightGray);
      for (t_coordinate= 151; t_coordinate <= 170; t_coordinate ++)
        {
        this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
        this_real_value = topParent.real_value_int_array[t_coordinate];
        g.drawLine(X_PIXEL_POS_A-last_real_value+(t_coordinate-1-160),Y_PIXEL_POS_A-last_imaginary_value-((t_coordinate-1-160)>>1),X_PIXEL_POS_A-this_real_value+(t_coordinate-160),Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1));
        last_imaginary_value = this_imaginary_value ;
        last_real_value = this_real_value ;
        }
      }
    // draw the present time:
    g.setColor(Color.white);
    t_coordinate=topParent.timeValeurNow+160;
    if ((t_coordinate >= 0) && (t_coordinate <= 320))
      {
      this_real_value = topParent.real_value_int_array[t_coordinate];
      this_imaginary_value = topParent.imaginary_value_int_array[t_coordinate];
      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2);
      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2);
      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)+2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2);
      g.drawLine(X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)+2,X_PIXEL_POS_A-this_real_value+(t_coordinate-160)-2,Y_PIXEL_POS_A-this_imaginary_value-((t_coordinate-160)>>1)-2);
      }
} // end if(false)
    } // end paint()

  } // end blackBoardThree2DClass       


//




class allControlsClass extends Panel
  {
//  realVsTimeClass                        realVsTime;
//  timeVsNegRealClass                 timeVsNegRealClass;
//  imaginaryVsNegRealClass       imaginaryVsNegReal;
//  imaginaryVsTimeClass             imaginaryVsTime;
//  amplitudeSigmaOmegaClass   amplitudeSigmaOmega;
//  timeResetDemoClass                timeResetDemo;
  final double eight_on_ten_PI = 0.2546479089 ;
  final double ten_PI_on_eight = 3.926990817 ;

  String fDeTString1 = "f(0)= 1 e( [ 0 +  0j  ] * 0)";
  Label fDeTLabel1;
  String fDeTString2 = "    = 1 e( 0 + 0j )";
  Label fDeTLabel2;
  String fDeTString3 = "f(0)= 1 e^( 0 * 0 ) cos ( 0 * 0 )";
  Label fDeTLabel3;
  String fDeTString4 = "        +1 e( 0 * 0 ) sin ( 0 * 0 )j";
  Label fDeTLabel4;
  String fDeTString5 = "    =  1 + 0j";
  Label fDeTLabel5;

  String amplitudeValeurButtonString    = "0";
  Scrollbar amplitudeValeurScrollbar;
  Button amplitudeValeurButton;
  String sigmaValeurButtonString        = "0";
  Scrollbar sigmaValeurScrollbar;
  Button sigmaValeurButton;
  String omegaValeurButtonString        = "0 PI/80 rad/s";
  Scrollbar omegaValeurScrollbar;
  Button omegaValeurButton;
  String timeValeurButtonString        = "0 s";
  Scrollbar timeValeurScrollbar;
  Button timeValeurButton;

  String zoomValeurButtonString    = "zoom= *1 (cube occupant l'espace -1 a 1 pour les trois axes:r,i,t)";
  Button zoomValeurButton;

  String showProjRICheckboxString    = "affiche projection Reel-Imaginaire  (gris)";
  Checkbox showProjRICheckbox;
  String showProjRTCheckboxString    = "affiche projection Reel-temps       (vert)";
  Checkbox showProjRTCheckbox;
  String showProjITCheckboxString    = "affiche projection Imaginaire-temps (rouge)";
  Checkbox showProjITCheckbox;

  ExponComplexFr207 topParent;

  allControlsClass(ExponComplexFr207 topParentPassing)
    {
    topParent = topParentPassing;
    setLayout(new GridLayout(30,1,1,1));
    
    add (new Label("f(temps)= amplitude * e^( ( sigma +   j * omega ) * temps)"));
    add (new Label("f(t) = Ae([sigma+jw]t) "));
    fDeTLabel1 = new Label(fDeTString1);
    add (fDeTLabel1);
    fDeTLabel2 = new Label(fDeTString2);
    add (fDeTLabel2);
    fDeTLabel3 = new Label(fDeTString3);
    add (fDeTLabel3);
    fDeTLabel4 = new Label(fDeTString4);
    add (fDeTLabel4);
    fDeTLabel5 = new Label(fDeTString5);
    add (fDeTLabel5);

    add (new Label("amplitude"));
    amplitudeValeurButton = new Button (amplitudeValeurButtonString);
    add (amplitudeValeurButton);
    amplitudeValeurScrollbar = new Scrollbar(Scrollbar.HORIZONTAL,10,0,-25,25);
    add (amplitudeValeurScrollbar);

    add (new Label(""));

    add (new Label("sigma"));
    sigmaValeurButton = new Button (sigmaValeurButtonString);
    add (sigmaValeurButton);
    sigmaValeurScrollbar = new Scrollbar(Scrollbar.HORIZONTAL,0,0,-100,100);
    add (sigmaValeurScrollbar);
    add (new Label(""));

    add (new Label("omega"));
    omegaValeurButton = new Button (omegaValeurButtonString);
    add (omegaValeurButton);
    omegaValeurScrollbar = new Scrollbar(Scrollbar.HORIZONTAL,80,0,-160,160);
    add (omegaValeurScrollbar);
    add (new Label(""));

    add (new Label("temps"));
    timeValeurButton = new Button (timeValeurButtonString);
    add (timeValeurButton);
    timeValeurScrollbar = new Scrollbar(Scrollbar.HORIZONTAL,0,0,-160,160);
    add (timeValeurScrollbar);
    add (new Label(""));

    zoomValeurButton = new Button (zoomValeurButtonString);
    add(zoomValeurButton);

    showProjRICheckbox = new Checkbox(showProjRICheckboxString,null,false);
    add (showProjRICheckbox);
    showProjRTCheckbox = new Checkbox(showProjRTCheckboxString,null,false);
    add (showProjRTCheckbox);
    showProjITCheckbox = new Checkbox(showProjITCheckboxString,null,false);
    add (showProjITCheckbox);

    }
//  public boolean action(Event evt, Object arg)
//    {
//    if (evt.target instanceof Button)
//      {
//      if (arg ==      amplitudeValeurButtonString) topParent.amplitudeLogValeurNow=0;
//      else if (arg == sigmaValeurButtonString) topParent.sigmaValeurNow=10;
//      else if (arg == omegaValeurButtonString) topParent.omegaValeurNow=0;
//      } //end of if (evt.target instanceof Button)
//    redrawLabels();
//    return true;
//    } // end of public boolean action(Event evt, Object arg)


  public boolean handleEvent(Event evt)
    {
    switch(evt.id){
      case Event.ACTION_EVENT:
        if (evt.target instanceof Button)
          {
          if (evt.arg == amplitudeValeurButtonString)
            {
            topParent.amplitudeValeurNow=10;
            amplitudeValeurScrollbar.setValue(10);
            }
          else if (evt.arg == sigmaValeurButtonString)
            {
            topParent.sigmaValeurNow=0;
            sigmaValeurScrollbar.setValue(0);
            }
          else if (evt.arg == omegaValeurButtonString)
            {
            topParent.omegaValeurNow=80;
            omegaValeurScrollbar.setValue(80);
            }
          else if (evt.arg == timeValeurButtonString)
            {
            topParent.timeValeurNow=0;
            timeValeurScrollbar.setValue(0);
            }
          else if (evt.arg == zoomValeurButtonString)
            {
            if (topParent.zoom==0)topParent.zoom=1;
            else if (topParent.zoom==1) topParent.zoom=2;
            else topParent.zoom=0;
            }
          topParent.blackBoardNeedsToBeRedrawn=true;
          } 
        if (evt.target instanceof Checkbox)
          {
          topParent.showProjRI=showProjRICheckbox.getState();
          topParent.showProjRT=showProjRTCheckbox.getState();
          topParent.showProjIT=showProjITCheckbox.getState();
          topParent.blackBoardNeedsToBeRedrawn=true;
          }
        redrawLabels();
        return true;
//      case Event.SCROLL_ABSOLUTE:
//        topParent.sigmaValeurNow=22;
//        redrawLabels();
//        return true;
      default:
//        return false;
      if (evt.target instanceof Scrollbar)
        {
        if (evt.target== amplitudeValeurScrollbar) topParent.amplitudeValeurNow= amplitudeValeurScrollbar.getValue();
        else  if (evt.target== sigmaValeurScrollbar) topParent.sigmaValeurNow=sigmaValeurScrollbar.getValue();
        else  if (evt.target== omegaValeurScrollbar) topParent.omegaValeurNow=omegaValeurScrollbar.getValue();
        else  if (evt.target== timeValeurScrollbar) topParent.timeValeurNow=timeValeurScrollbar.getValue();
        topParent.blackBoardNeedsToBeRedrawn=true;
        }
      }
      return false;
//    if (evt.target instanceof Scrollbar)
//      {
//      if (== amplitudeValeurScrollbar) topParent.amplitudeValeurNow=3;
//      topParent.sigmaValeurNow=3;
//      }
//    redrawLabels();
//    return true;
    } // end of public boolean handleEvent(Event evt)


  public void redrawLabels()
    {
    fDeTString1 = "f( " + topParent.timeValeurNow*0.1+ " )= "+topParent.amplitudeValeurNow*0.1+" e( [ "+topParent.sigmaValeurNow*0.01+" +  j"+topParent.omegaValeurNow*0.1+"/8 PI rad/s  ] * "+topParent.timeValeurNow*0.1+" )";
    fDeTString2 = "    =   "+topParent.amplitudeValeurNow*0.1+" e( "+topParent.sigmaValeurNow*0.01 * topParent.timeValeurNow*0.1+" + j"+topParent.omegaValeurNow*0.1*topParent.timeValeurNow*0.1+"/8 PI rad )";
    fDeTString3 = "f( "+topParent.timeValeurNow*0.1+" )= "+topParent.amplitudeValeurNow*0.1+" e ( "+topParent.sigmaValeurNow*0.01+" * "+topParent.timeValeurNow*0.1+" ) cos ( "+topParent.omegaValeurNow*0.1+"/8 PI rad/s * "+topParent.timeValeurNow*0.1+" ) ";
    fDeTString4 = "        + j"+topParent.amplitudeValeurNow*0.1+" e ( "+topParent.sigmaValeurNow*0.01+" * "+topParent.timeValeurNow*0.1+" ) sin ( "+topParent.omegaValeurNow*0.1+"/8 PI rad/s * "+topParent.timeValeurNow*0.1+" ) ";
    fDeTString5 = "    = "+((topParent.real_value_int_array[topParent.timeValeurNow+160])*0.0125)+" + j"+((topParent.imaginary_value_int_array[topParent.timeValeurNow+160])*0.0125);
    fDeTLabel1.setText(fDeTString1);
    fDeTLabel2.setText(fDeTString2);
    fDeTLabel3.setText(fDeTString3);
    fDeTLabel4.setText(fDeTString4);
    fDeTLabel5.setText(fDeTString5);
    amplitudeValeurButtonString =String.valueOf(topParent.amplitudeValeurNow*0.1);
    amplitudeValeurButton.setLabel(amplitudeValeurButtonString);
    sigmaValeurButtonString=String.valueOf(topParent.sigmaValeurNow*0.01);
    sigmaValeurButton.setLabel(sigmaValeurButtonString);
    if (topParent.omegaUnitesIsInPI)
      {
      omegaValeurButtonString=String.valueOf(topParent.omegaValeurNow*0.1)+"/8 PI rad/s";
      }
    else
      {
      omegaValeurButtonString=String.valueOf(topParent.omegaValeurNow*0.1)+"rad/s";
      }
    omegaValeurButton.setLabel(omegaValeurButtonString);
    timeValeurButtonString=String.valueOf(topParent.timeValeurNow*0.1 +" s");
    timeValeurButton.setLabel(timeValeurButtonString);
    zoomValeurButtonString = "zoom= *"+(1<<(topParent.zoom))+"  (le cube occupe l'espace de -1 a 1 pour les trois axes: r,i,t)";
    zoomValeurButton.setLabel(zoomValeurButtonString);
    }

  public void update(Graphics g)
    {
    paint(g);
    }

  public void paint(Graphics g)
    {
    redrawLabels();
    } // end paint()



  public Insets insets()
    {
    return new Insets(1,1,1,1);
    }


  } // end of class allControlsClass






