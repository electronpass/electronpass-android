/*
This file is part of ElectronPass.

ElectronPass is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

ElectronPass is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with ElectronPass. If not, see <http://www.gnu.org/licenses/>.
*/

package io.github.electronpass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.electronpass.libelectronpass.Passwords
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var passwords: Passwords = Passwords()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample_text.text = passwords.generate_random_pass(16)
    }
}
