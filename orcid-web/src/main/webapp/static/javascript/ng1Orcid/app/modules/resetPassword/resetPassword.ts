import * as angular 
    from 'angular';

import { Directive, NgModule } 
    from '@angular/core';

import { downgradeComponent, UpgradeModule } 
    from '@angular/upgrade/static';

//User generated
import { ResetPasswordComponent } 
    from './resetPassword.component';

import { CommonNg2Module }
    from './../common/common';

// This is the Angular 1 part of the module
export const ResetPasswordModule = angular.module(
    'ResetPasswordModule', 
    []
);

// This is the Angular 2 part of the module
@NgModule(
    {
        imports: [
            CommonNg2Module
        ],
        declarations: [ 
            ResetPasswordComponent
        ],
        entryComponents: [ 
            ResetPasswordComponent 
        ],
        
    }
)
export class ResetPasswordNg2Module {}

// components migrated to angular 2 should be downgraded here
//Must convert as much as possible of our code to directives
ResetPasswordModule.directive(
    'resetPasswordNg2', 
    <any>downgradeComponent(
        {
            component: ResetPasswordComponent,
        }
    )
);
