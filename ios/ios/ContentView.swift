//
//  ContentView.swift
//  ios
//
//  Created by Felipe Rodrigues Celestino on 4/3/20.
//  Copyright © 2020 Felipe Rodrigues Celestino. All rights reserved.
//

import SwiftUI
import shared

struct ContentView: View {
    @State private var weight = ""
    @State private var height = ""
    @State private var imcResult = ""
    
    var body: some View {
        NavigationView {
            Form {
                TextField("Peso",
                    text: $weight)
                .keyboardType(.numberPad)
                TextField("Altura",
                          text: $height)
                    .keyboardType(.decimalPad)
                Button(action: {
                    if(ValidationKt.validateForm(weight: self.weight, height: self.height)) {
                        let imc = CalculationKt.getImc(
                            weight: Int32(self.weight) ?? 0, height: Float(self.height) ?? 0.0
                        )
                        let imcResult = CalculationKt.getImcResult(imc: imc)

                        self.imcResult = "Você está com: \(imcResult)"
                    }
                }) {
                    Text("Calcular")
                }
                Text("\(imcResult)")
            }.navigationBarTitle(Text(ActualKt.appTitle()))
    
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
