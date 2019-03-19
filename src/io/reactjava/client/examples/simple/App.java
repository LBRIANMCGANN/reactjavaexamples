/*==============================================================================

name:       App.java

purpose:    Simple App.

history:    Sat May 13, 2018 10:30:00 (Giavaneers - LBM) created

notes:

                        COPYRIGHT (c) BY GIAVANEERS, INC.
         This source code is licensed under the MIT license found in the
             LICENSE file in the root directory of this source tree.

==============================================================================*/
                                       // package --------------------------- //
package io.reactjava.client.examples.simple;
                                       // imports --------------------------- //
import io.reactjava.client.core.react.AppComponentTemplate;
import io.reactjava.client.core.react.Properties;

                                       // App ================================//
public class App extends AppComponentTemplate
{
                                       // class constants --------------------//
                                       // (none)                              //
                                       // class variables ------------------- //
                                       // (none)                              //
                                       // public instance variables --------- //
                                       // (none)                              //
                                       // protected instance variables -------//
                                       // (none)                              //
                                       // private instance variables -------- //
                                       // (none)                              //
/*------------------------------------------------------------------------------

@name       initialize - set properties
                                                                              */
                                                                             /**
            Set properties.

@return     void

@return     props     properties

@history    Mon May 21, 2018 10:30:00 (Giavaneers - LBM) created

@notes

                                                                              */
//------------------------------------------------------------------------------
public Properties initialize(
   Properties props)
{
   super.initialize(props);

   props.set("text", getClass().getName() + ".java");
   return(props);
}
/*------------------------------------------------------------------------------

@name       render - render markup
                                                                              */
                                                                             /**
            Render markup.

@return     void

@history    Mon May 21, 2018 10:30:00 (Giavaneers - LBM) created

@notes

                                                                              */
//------------------------------------------------------------------------------
public void render()
{
   String imgURL = "images/logo.svg";
/*--
   <IonicScrollContent>
      <div class="App">
         <header class="App-header">
            <img src={imgURL} class="App-logo" alt="logo" />
            <h1 class="App-title">Welcome to ReactJava</h1>
         </header>
         <p class="App-intro">
            To get started, edit <code>{(String)props.get("text")}</code>,
            <strong>save and refresh browser</strong> to reload.
         </p>
      </div>
   </IonicScrollContent>
--*/
}
/*------------------------------------------------------------------------------

@name       renderCSS - get component css
                                                                              */
                                                                             /**
            Get component css.

@return     void

@history    Mon May 21, 2018 10:30:00 (Giavaneers - LBM) created

@notes

                                                                              */
//------------------------------------------------------------------------------
public void renderCSS()
{
/*--
   .App {
     text-align: center;
   }

   .App-logo {
     animation: App-logo-spin infinite 20s linear;
     height: 80px;
   }

   .App-header {
     background-color: #222;
     height: 150px;
     padding: 20px;
     color: white;
   }

   .App-title {
     font-size: 1.5em;
   }

   .App-intro {
     font-size: large;
   }

   @keyframes App-logo-spin {
     from { transform: rotate(0deg); }
     to { transform: rotate(360deg); }
   }
--*/
}
}//====================================// end App ============================//
