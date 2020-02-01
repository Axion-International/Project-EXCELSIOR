import { HttpRequest, HttpHandler, HttpEvent, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';


export class HttpInterceptor implements HttpInterceptor{

    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
        return next.handle(req).pipe(catchError((error: HttpErrorResponse)=>{
          if (error instanceof HttpErrorResponse){
            return throwError(error);
          } else {
            return throwError(error);
          }
        })
        );
      }

}
